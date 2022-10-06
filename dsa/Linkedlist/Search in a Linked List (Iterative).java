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
class Search_linkedlist
{
    public static void main(String[]args)
    {
        Node head=new Node(15);
        head.next=new Node(30);
        head.next.next=new Node(45);
        head.next.next.next=new Node(60);
        int k=60;
       System.out.println(search_linkedlist(head,k));
        }
    static int search_linkedlist(Node head, int k)
    {  int count=1;
       Node curr=head;
       while(curr!=null)
       {        
        if(curr.data==k)
        {
            return count;          
        }
        count++;
        curr=curr.next;
       }
       return -1;
    }
}
