import java.util.ArrayDeque;
import java.util.Deque;

import javax.print.event.PrintEvent;

class Stock_span_probl_efficient
{

    static void Stock_span_probl_efficient(int arr[])
    {  Deque<Integer> st=new ArrayDeque<>();
        st.push(0);
        System.out.println(1);
       for(int i=1;i<arr.length;i++)
       {
        while(st.isEmpty()==false && arr[st.peek()]<=arr[i])
        {
            st.pop();
        }
        int span=st.isEmpty()?i+1:i-st.peek();
        System.out.println(span);
        st.push(i);  
       }
    }
    public static void main(String[]args)
    {   int arr[]=new int[]{60,10,20,15,35,50};
        Stock_span_probl_efficient(arr);
    }
}