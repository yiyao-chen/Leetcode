/*
Given the root of an n-ary tree, return the preorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)
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
    List<Integer> list = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if(root==null) return list;

        list.add(root.val);
        System.out.println(root.val);


        for(Node child : root.children) {
            if(child != null) {
                preorder(child);
            }
        }

        return list;


    }
}
