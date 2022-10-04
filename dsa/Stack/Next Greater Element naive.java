

class Next_greater_elem
{   static void print_next_greater(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {       int j;
                for(j=i;j<arr.length;j++)
                {
                    if(arr[j]>arr[i])
                    {
                        System.out.println(arr[j]+" ");
                        break;
                    }
                }
                if(j==arr.length)
                {
                    System.out.println("-1");
                }
        }
    }
    public static void main(String [] args)
    {
         int arr[]=new int[]{10,15,20,25};
         print_next_greater(arr);
    }

}