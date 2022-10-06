class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}
class Insert_given_position
{ 
    public static void main(String[]args)
    {   
        Node head=new Node(10);
        head.next=new Node(24);
        head.next.next=new Node(40);
        head.next.next.next=new Node(50);
        int x=51,pos=1;
        head=insert_given_position(head,pos,x);
        printlist(head);
    }
    static Node insert_given_position(Node head,int pos,int x)
    {
        
       
        Node data1=new Node(x);
        if(pos==1)
        {
            data1.next=head;
            return data1;
        }
        Node curr=head;
        for(int i=1;i<pos-1 && curr!=null ;i++)
        {
            curr=curr.next;
        }
        if(curr==null) return head;
        
        data1.next=curr.next;
        curr.next=data1;
        return head;

    }
    static void  printlist(Node head)
    {   Node curr=head;
        while(curr!=null)
        {
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
      
    }
    
}