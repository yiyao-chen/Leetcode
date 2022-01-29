"""
Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
"""

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    """
    one node is LCA of p and q if the node is exactly smaller than one of them and greater than one of them

    Procedure:
    traverse tree from the root
    if node is greater than both p and q:
        traverse the left subtree
    if node is smaller than both p and q:
        traverse the right subtree
    otherwise return node

    """
    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        if root == None: return

        if p.val < root.val and q.val < root.val:
            # recurse the left subtree
            return self.lowestCommonAncestor(root.left, p, q)

        if p.val > root.val and q.val > root.val:
            # recurse the right subtree
            return self.lowestCommonAncestor(root.right, p, q)
        else:
            return root
