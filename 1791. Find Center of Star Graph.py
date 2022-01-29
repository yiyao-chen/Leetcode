"""
There is an undirected star graph consisting of n nodes labeled from 1 to n. A star graph is a graph where there is one center node and exactly n - 1 edges that connect the center node with every other node.

You are given a 2D integer array edges where each edges[i] = [ui, vi] indicates that there is an edge between the nodes ui and vi. Return the center of the given star graph.
"""

"""
Start is connected to every other nodes
so we get an edge A[0], check if A[0][0] or A[0][1] appears in one another edge

"""
class Solution:

    def findCenter(self, edges: List[List[int]]) -> int:

        e = edges[0]

        if e[0] == edges[1][0]:
            return e[0]
        if e[1] == edges[1][0]:
            return e[1]

        if e[0] == edges[1][1]:
            return e[0]
        if e[1] == edges[1][1]:
            return e[1]
