import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

class Reversing_queue_recursi
{
    public static void main(String[]args)
    {
    Deque<Integer>q=new ArrayDeque<>();
    q.offer(12);
    q.offer(20);
    q.offer(15);
    q.offer(5);
    reversing_queue_recursi(q);
    System.out.println(q);

    }
    static void reversing_queue_recursi(Queue<Integer>q)
    {
        if(q.isEmpty()) return;
        int x=q.peek();
        q.remove();
        reversing_queue_recursi(q);
        
        q.add(x);
        
    }
}