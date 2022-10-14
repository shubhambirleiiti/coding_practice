package Problem;


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long sum=0;
        long left=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        for(int j=0;j<n;j++)
        {
            sum-=arr[j];
            if(sum==left) return j+1;
            left+=arr[j];
        }
        return -1;
}
}
