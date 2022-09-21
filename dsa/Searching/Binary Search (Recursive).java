class Binary_search_recursive
{ 

	static int bSearch_recrsive(int arr[], int low,int high, int k)
	{
	        int mid=(low+high)/2;
            if(low>high) return -1;
            if(arr[mid]==k) return mid;
            else if(arr[mid]>k) return bSearch_recrsive(arr, low, mid-1, k);
            else return bSearch_recrsive(arr, mid+1, high, k);
           
	}

public static void main(String args[]) 
    {
        int arr[] = {10, 20, 30, 40, 50, 60}, n = 6;

		int k = 60;
    
        System.out.println(bSearch_recrsive(arr,0 ,n-1, k));
		
    } 

}
