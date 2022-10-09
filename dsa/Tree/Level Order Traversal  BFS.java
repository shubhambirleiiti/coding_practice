
package dsa.Tree;

import java.util.LinkedList;
import java.util.Queue;

class  Node
{
    int key;
    Node left;
    Node right;
    Node(int k)
    {
        key=k;
        left=right=null;
    }
}

class Level_order
{
    public static void main(String[]args)
    {   int k=2;
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.right=new Node(70);
    	root.right.right.right=new Node(80);
        printlevelorder(root);
    }
    static void printlevelorder(Node root)
    {
           if(root==null) return;
           Queue<Node>q=new LinkedList<Node>();
           q.add(root);
           while(q.isEmpty()==false)
           {
            Node curr=q.poll();
            System.out.print(curr.key+" ");
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                q.add(curr.right);
            }
           }
    }
    
    
}