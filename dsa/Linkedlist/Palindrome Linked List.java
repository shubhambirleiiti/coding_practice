import java.util.ArrayDeque;
import java.util.Deque;

class Node
{
   char data;
   Node next;
   Node(char ch)
   {
    data=ch;
    next=null;
   }
}
class Palindrome_linked
{
    public static void main(String[]args)
    {
        Node head=new Node('g');
        head.next=new Node ('f');
        head.next.next=new Node('g');
        System.out.println(ispalidrome(head));

    }
    static boolean ispalidrome(Node head)
    {   Deque <Character>st=new ArrayDeque<Character>();
       
        for(Node curr=head ;curr.next!=null;curr=curr.next)
        {
            st.push(curr.data);
        }
        for(Node curr=head;curr.next!=null;curr=curr.next)
        {
             if(st.pop()!=curr.data)
             {
                return false;
             }
        }
        return true;
    }
}
