
class Node
{
    int data;
    Node prev,next;
    Node(int x)
    {
        data=x;
       
        next=null;
        prev=null;
    }
}
class Reverse_doubly_linked
{
    public static void main(String[]args)
    {
       
        Node head=new Node(13);
        Node temp1=new Node(44);
        Node temp2=new Node(60);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        head=reverse(head);
        printlist(head);
    }
    static Node reverse(Node head)
    {   Node curr=head;
        Node prev=null;
       
       if(head!=null || head.next==null) return head;
      
       while(curr!=null)
       {
           prev=curr.prev;
           curr.prev=curr.next;
           curr.next=prev;
           curr=curr.prev;
       }
    
        return head;
    }
    static void printlist(Node head)
    {   Node curr=head;
       
        while(curr.next!=null)
        {
            System.out.println(curr.data+" ");
        }
    }
}