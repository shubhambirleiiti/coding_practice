class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data =x;
        next=null;
    }

}
class  Insert_begining
{
    public static void main(String []args)
    {
        Node head=null;
        head=insert_begining(head,20);
        head=insert_begining(head,40);
        head=insert_begining(head,60);
        printlist(head);

    }
    static Node insert_begining(Node head,int x)
    {
           Node temp=new Node(x);
           temp.next=head;
           return temp;

    }
    static void printlist(Node head)
    {         Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
    }

}