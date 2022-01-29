/*
Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.

*/

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):

    """
    perform dfs from the root, sum up the values
    if sum = targetSum, return true

    """
    def hasPathSum(self, root, targetSum):
        """
        :type root: TreeNode
        :type targetSum: int
        :rtype: bool
        """

        def dfs(node = root, total = 0):

            if node == None:
                return False

            total += node.val

            if node.left == None and node.right == None and total == targetSum:
                return True

            return dfs(node.left, total) or dfs(node.right, total)

        return dfs()
