
package dsa.Tree;
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

class Print_Nk_Distance
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
        printkdist(root,k);
    }
    static void printkdist(Node root,int k)
    {
           if(root==null) return ;
           if(k==0) System.out.println(root.key+" ");
           else
           {
            printkdist(root.left, k-1);
            printkdist(root.right, k-1);
           }

    }
    
    
}