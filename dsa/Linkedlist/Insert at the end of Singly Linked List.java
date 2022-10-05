
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
class Insert_end
{
    public static void main(String[]args)
    {
        Node head=null;
        head=insert_end(head,20);
        head=insert_end(head,30);
        head=insert_end(head,40);
        head=insert_end(head,50);
        println(head);

    }
    static Node insert_end(Node head,int x)
    {
        Node temp=new Node(x);  
        if(head==null) return temp;
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        
        }
        curr.next=temp; 
        return head;
    }
    static void println(Node head)
    {   Node curr=head;
        while(curr!=null)
        {
          
            System.out.print(curr.data +" ");
            curr=curr.next;
        }
    }


}
