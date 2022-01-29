/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Example:
Input: root = [1,2,2,3,4,4,3]
Output: true
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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        return isMirror(root.left, root.right);

    }

    public boolean isMirror(TreeNode node1, TreeNode node2) {
        //no left and no right subtree
        if(node1 == null && node2 == null) return true;
        // only one subtree
        if(node1 == null || node2 == null) return false;

        if(node1.val != node2.val) return false;

        return (node1.val==node2.val) && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }
}
