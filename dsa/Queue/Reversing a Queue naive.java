import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

class Reversing_queue
{
    public static void main(String[]args)
    {   
        Queue<Integer>q=new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        reverse(q);
    }
    static void reverse(Queue<Integer>q)
    {
        Stack<Integer>st=new Stack<>();
        while(q.isEmpty()==false)
        {
            st.push(q.remove());
         
        }
        while(st.isEmpty()==false)
        {
            q.add(st.pop());
        }
        System.out.println(q);

    }
}