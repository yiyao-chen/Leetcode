"""
Given the root of a binary tree, construct a string consisting of parenthesis and integers from a binary tree with the preorder traversal way, and return it.

Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship between the string and the original binary tree.
"""

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):


    def tree2str(self, root):
        """
        :type root: TreeNode
        :rtype: str
        """

        string = str(root.val)

        # if root has a left child
        if root.left != None:
            string += "(" + self.tree2str(root.left) + ")"
        # if root has no left child but a right child
        elif root.right:
            string += "()"


        # if root has a right child
        if root.right != None:
            string += "(" + self.tree2str(root.right) + ")"

        return string
        
