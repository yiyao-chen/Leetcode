/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.

Example
Input: root = [1,null,2,3]
Output: [1,3,2]
*/

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
 
 
 
import java.util.*;
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        while(!stack.isEmpty() || root != null) {
            
            // push left-chilren to stack
            while(root!= null) {
                stack.push(root);
                root = root.left;
            }
            // has reached the null-leaf of left subtree
            root = stack.pop();
            list.add(root.val);
                
            root = root.right;
            
        }
        
        return list;
    }
}
