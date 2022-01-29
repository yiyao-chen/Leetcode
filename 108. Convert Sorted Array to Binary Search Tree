/*
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        if(nums.length == 1) return new TreeNode(nums[0], null, null);

        // define root (middle of array)
        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid], null, null);

        // divide array into two halves and recursively build subtrees
        int[] firstHalf = Arrays.copyOfRange(nums, 0, mid);
        int[] secondHalf = Arrays.copyOfRange(nums, mid+1, nums.length);

        root.left = sortedArrayToBST(firstHalf);
        root.right = sortedArrayToBST(secondHalf);

        return root;

    }




    // another version
    /*
    public TreeNode sortedArrayToBST(int[] nums) {

        return recurse(nums, 0, nums.length-1);
    }
    public TreeNode recurse(int[] nums, int start, int end){
        if (start > end) return null;
        int mid = (start+end)/2;
        TreeNode p = new TreeNode(nums[mid]);
        p.left = recurse(nums, start, mid-1);
        p.right = recurse(nums, mid+1, end);

        return p;
    }
    */
}
