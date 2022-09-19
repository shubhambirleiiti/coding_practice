class Subarray{
    static String subArraySum(int arr[],int n,int req_sum)
    {    int cur_sum=0;
        for(int i =0;i<n;i++)
        {  
            cur_sum+=arr[i];
            if(cur_sum==req_sum)  return "yes";
        }
        return "no";
    }
public static void main(String[] args) 
{ 
   
    int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
    int n = arr.length; 
    int sum = 8; 
    System.out.println(subArraySum(arr, n, sum)); 
} 
}
