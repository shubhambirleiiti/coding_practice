class Binary_search
{ 

	static int bSearch(int arr[], int n, int k)
	{
	    int high=n-1,low=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==k) return mid;
			else if(arr[mid]>k)  high=mid-1;
			else low=mid+1;
		}
		return -1;
	}

public static void main(String args[]) 
    {
        int arr[] = {10, 20, 30, 40, 50, 60}, n = 6;

		int k = 50;
    
        System.out.println(bSearch(arr, n, k));
		
    } 

}
