class Niave_partition
{
    naive_partition(int arr[],int l,int p,int r)
    {
        
    }
    public static void main(String[]args)
    {
           int arr[]=new int[]{12,14,25,67,4,16,19};
           int n=arr.length;
           int p=5;
           naive_partition(arr,0,p,n);
           for(int i=0;i<n;i++)
           {
            System.out.println(arr[i]+" ");
           }

    }
}