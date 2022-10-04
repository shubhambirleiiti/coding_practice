import java.util.ArrayDeque;
import java.util.Deque;

class Previous_greater_elem_effi
{   static void print_previ_greter(int arr[])
    {
      Deque<Integer>st=new ArrayDeque<Integer>();
      st.push(arr[0]);
      System.out.println("-1");
      for(int i=1;i<arr.length;i++)
      {
        while(st.isEmpty()==false && st.peek()<arr[i])
        {
            st.pop();
        }
        int pg=(st.isEmpty()? -1: st.peek());
        System.out.println(pg);
        st.push(arr[i]);
      }
    }
    public static void main(String [] args)
    {
         int arr[]=new int[]{20,30,10,20,15};
         print_previ_greter(arr);
    }

}