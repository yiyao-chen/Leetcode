/*
Given a n-ary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).
*/


/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        int maxDepth = 0;

        if(root==null) return 0;

        for(Node child : root.children) {
            if(child != null) {
                maxDepth = Math.max(maxDepth, maxDepth(child));
            }

        }
        return maxDepth + 1;
    }
}
