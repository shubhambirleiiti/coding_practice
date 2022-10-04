
class Stock_span_probl_naive
{
    public static void main(String[]args)
    {   int arr[]=new int[]{30,20,25,28,27,29};
        stock_span_probl_naive(arr);
    }
    static void stock_span_probl_naive(int[]arr)
    {    
        for(int i=0;i<arr.length;i++)
        {    int count=0;
            for(int j=i;j>=0;j--)
            {
                if(arr[i]>=arr[j])
                {
                   count++;
                }
                else{
                    break;
                }
            }
            System.out.println(count);
            count=0;
        }
    }
}
