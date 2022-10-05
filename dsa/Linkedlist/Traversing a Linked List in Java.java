
class Traverisng_in_linked
{   static class Node
    {
        int data;
        Node next;
        Node(int x)
        {
            data=x;
            next=null;
        }
    }
    public static void main(String[]args)
    {
        Node head=new Node(33);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        printlist(head);
    }
    public static void printlist(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
