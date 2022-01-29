"""
Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
"""

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):

    def find_leafs(self, leafs, start):
        #print(start.val)
        if start==None:
            return

        if start.left == None and start.right == None:
            leafs.append(start.val)
            return

        self.find_leafs(leafs,start.left)
        self.find_leafs(leafs,start.right)


        return leafs




    def leafSimilar(self, root1, root2):
        """
        :type root1: TreeNode
        :type root2: TreeNode
        :rtype: bool
        """



        leafs1 = list()
        leafs2= list()

        self.find_leafs(leafs1,root1)
        self.find_leafs(leafs2,root2)

        print(leafs1)
        print(leafs2)

        print(leafs1==leafs2)
        return leafs1==leafs2
        
