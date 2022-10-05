import java.util.*;
import java.util.Queue;
class Generate_numbers
{
    public static void main(String[]args)
    {
        Queue<String> q=new ArrayDeque<>();
        q.offer("5");
        int n=5;
        q.offer("6");
        generate_numbers(q,n);

    }
    static void generate_numbers(Queue<String> q,int n)
    {
        for(int i=0;i<n;i++)
        {
            String curr=q.peek();
            System.out.println(curr);
            q.remove();
            q.offer(curr+"5");
            q.offer(curr+"6");

        }

    }
  
}