package dsa.Tree;


class Node  
{ 
  int key; 
  Node left; 
  Node right; 
  Node(int k){
      key=k;
      left=right=null;
  }
}


class LeftView{ 
    
    public static void main(String args[]) 
    { 
      
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	
        leftview(root);
    } 
    static int maxlevel=0;
    static void LV_Binary(Node root,int level)
    {   
        if(root==null) return ;
        if(maxlevel<level)
        {
            System.out.print(root.key+" ");
            maxlevel=level;
        }
        LV_Binary(root.left,level+1);
        LV_Binary(root.right,level+1);

    }
    static void leftview(Node root)
    {
        LV_Binary(root, 1);
    }

    

      
} 

