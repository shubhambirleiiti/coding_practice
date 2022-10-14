class Subarray{
    static boolean subArraySum(int arr[],int n,int req_sum)
    {   int s=0,curr=0;
        for(int e=0;e<n;e++)
        {
             curr+=arr[e];
             if(req_sum<curr)
             {
                curr-=arr[s];
                s++;
             }
             if(req_sum==curr) return true;
        }    
        return false;
    }
public static void main(String[] args) 
{ 
   
    int arr[] = {4,8,12,5}; 
    int n = arr.length; 
    int sum = 17; 
    System.out.println(subArraySum(arr, n, sum)); 
} 
}
