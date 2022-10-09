package dsa.Tree;


class Node
{
    int key;
    Node left,right;
    Node(int k)
    {
        key=k;
    }
}
class Height_binary
{
    public static void main(String[]args)
    {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        System.out.println(height_binary(root));
    }
    static int height_binary(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        else
        {
            return Math.max(height_binary(root.left),height_binary(root.right))+1;
        }
    }
}