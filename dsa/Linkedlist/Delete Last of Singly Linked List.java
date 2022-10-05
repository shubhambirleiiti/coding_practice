
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
class Delete_last
{
    public static void main(String[]main)
    {
           Node head=new Node(10);
           head.next=new Node(20);
           head.next.next=new Node(30);
           printlist(head);
           head=delete_last(head);
           printlist(head);
           
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
    static Node delete_last(Node head)
    {
        if(head==null) return null;
        if(head.next==null) return null;
        Node curr=head;
        while(curr.next.next!=null)
        { 
            curr=curr.next;
        }
        curr.next=null;
        return head;

    }
}