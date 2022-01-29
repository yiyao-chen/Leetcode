/*
Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.
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
    List<String> result = new ArrayList<>();


    public List<String> binaryTreePaths(TreeNode root) {

        if(root==null) return result;

        buildPath(root, String.valueOf(root.val));

        return result;
    }

    public void buildPath(TreeNode node, String list) {
        if(node.left == null && node.right == null) {
            result.add(list);
            return;
        }
        if(node.left != null) {
            buildPath(node.left, list + "->" + String.valueOf(node.left.val));
        }
        if(node.right != null) {
            buildPath(node.right, list + "->" + String.valueOf(node.right.val));
        }
    }
}
