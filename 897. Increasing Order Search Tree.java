/*
Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.
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


    public TreeNode increasingBST(TreeNode root) {

        List<Integer> list = new ArrayList();

        inorder(root, list);

        TreeNode node = new TreeNode(0);
        TreeNode temp = node;

        for(int i : list) {
            temp.right = new TreeNode(i);
            temp = temp.right;
        }

        return node.right;

    }

    public void inorder(TreeNode root, List<Integer> list) {
        if(root==null) return;

        inorder(root.left, list);

        list.add(root.val);

        inorder(root.right, list);

    }

}
