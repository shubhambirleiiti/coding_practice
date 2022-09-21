class Binary_search_recursive_efficient
{ 

	static int bSearch_recrsive_efficient(int arr[], int low,int high, int x)
	{
        if(low > high)
        return -1;

    int mid = (low + high) / 2;

    if(x > arr[mid])
        return bSearch_recrsive_efficient(arr, mid + 1, high, x);

    else if(x < arr[mid])
        return bSearch_recrsive_efficient(arr, low, mid - 1, x);

    else
    {
        if(mid == 0 || arr[mid - 1] != arr[mid])
            return mid;

        else
            return bSearch_recrsive_efficient(arr, low, mid - 1, x);
    }        
	}

public static void main(String args[]) 
    {
        int arr[] = {5, 10, 10, 15, 20, 20, 20}, n = 7;

		int k = 20;
    
        System.out.println(bSearch_recrsive_efficient(arr,0 ,n-1, k));
		
    } 

}
