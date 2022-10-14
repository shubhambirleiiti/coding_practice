package Problem;

class Solution{
    
    //Function to find minimum adjacent difference in a circular array.
    // arr[]: input array
    // n: size of array
    public static int minAdjDiff(int arr[], int n) {
        int mindiff_final=Integer.MAX_VALUE;
        int mindiff=0;
        mindiff_final=Math.abs(arr[0]-arr[arr.length-1]);
        // Your code here
        for(int i=0;i<n-1;i++)
        {
          
          mindiff_final=Math.min(Math.abs(arr[i]-arr[i+1]),mindiff_final);
        }
        return mindiff_final;
        
    }
}
