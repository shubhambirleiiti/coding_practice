
class Node
{
    int data;
    Node prev;
    Node next;
    Node(int x)
    {
        data=x;
        prev=null;
        next=null;
    }
}
class Implementation_doubli
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
    }
}