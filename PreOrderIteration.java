import java.util.Stack;
class Node
{
    int data;
    Node left, right;
    public Node(int key)
    {
        data = key;
        left = right = null;
    }
}
class PreOrderIteration
{
    public static void preorderIterative(Node root)
    {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty())
        {
            Node curr = stack.pop();
            System.out.print(curr.data + " ");
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
    }
    public static void main(String[] args)
    {    
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
        preorderIterative(root);
    }
}
