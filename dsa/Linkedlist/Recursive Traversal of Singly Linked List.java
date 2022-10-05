
class Traverisng_in_linked_recur
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
    static void printlist(Node head)
    {   Node curr=head;
        if(head==null) return;
        System.out.print(curr.data+" ");
        curr=curr.next;
        printlist(curr);
    }
}
