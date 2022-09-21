class Find_peak_element
{
    static int Peak_element(int arr[],int n)
    {
        if(n==1) return arr[0];
        else if(arr[0]>arr[1]) return arr[0];
        else if(arr[n-1]>arr[n-2]) return arr[n-1];
        for(int i=1;i<n-1;i++)
        {
            if(arr[i]>arr[i+1]&& arr[i]>arr[i-1]) return arr[i];
            
        }
        return -1;
    }



	public static void main(String args[]) 
    {

		int arr[] = {5,10, 11, 12, 20, 12}, n = 6;

        System.out.println(Peak_element(arr, n));

    } 

}