class Subarray_naive
{   static boolean subArraySum(int []arr,int n,int sum)
    {  
     for(int i=0;i<n;i++)
       {
        int curr=0;
        for(int j=i;j<n;j++)
        {
            curr+=arr[j];
            if(curr==sum) return true;
        }
       }
        return false;

    }

	public static void main(String[] args) 
	{ 
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
		int n = arr.length; 
		int sum = 15; 
		System.out.println(subArraySum(arr, n, sum)); 
	} 
}