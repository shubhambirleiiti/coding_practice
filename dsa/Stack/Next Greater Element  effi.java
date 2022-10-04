import java.util.ArrayDeque;
import java.util.Deque;

class Next_greater_elem_effi
{   static void print_next_greater(int arr[])
    {
        Deque <Integer>st=new ArrayDeque<>();
        st.push(arr[arr.length-1]);
        System.out.println("-1");
        for(int i=arr.length-2;i>=0;i--)
        {
            while(st.isEmpty()==false && st.peek()<=arr[i])
            {
                st.pop();
            }
            int ng=st.isEmpty()?-1:st.peek();
            System.out.println(ng+" ");
            st.push(arr[i]);
            
            
        }
    
    }
    public static void main(String [] args)
    {
         int arr[]=new int[]{5,15,10,8,6,12,9,18};
         print_next_greater(arr);
    }

}