class Counts_1s
{
    static int countOnes(int []arr,int n)
    {
        int high=n-1,low=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==0) low=mid+1;
            else
            {
                if(mid==0 || arr[mid-1]!=arr[mid]) return (n-mid);
                else high=mid+1;
            }
        }
        return -1;
    }


	public static void main(String args[]) 
    {
        int arr[] = {0, 0, 1, 1, 1, 1}, n = 6;


		System.out.println(countOnes(arr, n));

    } 

}
