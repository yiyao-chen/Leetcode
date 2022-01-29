"""
There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1 (inclusive). The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi. Every vertex pair is connected by at most one edge, and no vertex has an edge to itself.

You want to determine if there is a valid path that exists from vertex source to vertex destination.

Given edges and the integers n, source, and destination, return true if there is a valid path from source to destination, or false otherwise.

"""

class Solution(object):

    def dfs(self,graph,visited,src,end):
        print(src)

        if src==end:
            return True

        visited[src] = True
        for nbr in graph[src]:
            if visited[nbr]==False:
                if self.dfs(graph,visited,nbr,end):
                    return True


        return False



    def validPath(self, n, edges, start, end):
        """
        :type n: int
        :type edges: List[List[int]]
        :type start: int
        :type end: int
        :rtype: bool
        """

        visited = [False]*n
        graph = defaultdict(list)

        # array to dict
        for i in range(len(edges)):
            graph[edges[i][0]].append(edges[i][1])
            graph[edges[i][1]].append(edges[i][0])

        #return dfs(self,graph,visited,start,end)
        return self.dfs(graph, visited, start, end)




        
