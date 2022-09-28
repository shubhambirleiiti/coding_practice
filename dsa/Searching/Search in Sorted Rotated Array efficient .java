import javax.lang.model.util.ElementScanner6;

class search_sorted_array
{
    
    static int search_sorted_array(int arr[],int low,int high,int x)
     {
        while(low<=high)
        {
        int mid=(low+high)/2;
        if(arr[mid]==x)
        { return mid;
        }
        if(arr[low]<arr[mid])
        {
            if((x>arr[low])&&(arr[mid]>x)) high=mid-1;
            else low=mid+1;
        }
        else
        {
            if((x>arr[mid]) && (x<arr[high])) low=mid+1;
            else high=mid-1;
    
        }
    }
        
        return -1;

     }




	public static void main(String args[]) 
    {

		int arr[] = {10, 20, 40, 60, 5, 8}, n = 6;

		int x = 5;

        System.out.println(search_sorted_array(arr,0, n-1, x));

    } 

}