
class Previous_greater_elem
{   static void print_previ_greter(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {   int j;
            for(j=i;j>=0;j--)
            {
                if(arr[j]>arr[i])
                {
                    System.out.println(arr[j]+" ");
                    break;
                }
            }
            if(j==-1)
            {
                System.out.println("-1");
            }

        }
    }
    public static void main(String [] args)
    {
         int arr[]=new int[]{20,30,10,5,15};
         print_previ_greter(arr);
    }

}