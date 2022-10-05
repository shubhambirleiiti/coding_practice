
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
class Delete_first
{
    public static void main(String[]args)
    {
        Node head=new Node(11);
        head.next=new Node(15);
        head.next.next=new Node(19);
        printlist(head);
        head=delete_first(head);
        printlist(head);
    }
    static Node delete_first(Node head)
    {
        if(head==null)
        {
            return null;
        }
        else
        {
             return head.next; 
        }   
    }
    static void printlist(Node head)
    {
       Node curr=head;
       while(curr!=null)
       {
        System.out.println(curr.data+" ");
        curr=curr.next;
       }
    }


}
