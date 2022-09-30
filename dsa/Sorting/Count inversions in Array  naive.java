class Count_inversions
{
    static int count_inversions(int arr[],int n)
    {  int count=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                   if(arr[i]>arr[j])
                   {
                    count++;
                   }
            }
        }
        return count;
    }
    public static void main (String[] args) 
    {
        int arr[] = new int[]{2,4,1,3,5};
        
        int n = arr.length;
	    System.out.println(count_inversions(arr,n));
        
    }
}
    