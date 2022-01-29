/*
Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> l= traverse(root, new ArrayList<Integer>());

        int sum = 0;

        for(int i : l) {
            if(i >= low && i <= high) {
                sum+= i;
            }
        }
        return sum;
    }

    public List<Integer> traverse(TreeNode node, List<Integer> list) {

        if(node==null) return list;

        traverse(node.left, list);
        list.add(node.val);
        return traverse(node.right, list);
    }
}
