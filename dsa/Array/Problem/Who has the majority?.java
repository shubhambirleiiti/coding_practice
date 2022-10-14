package Problem;

// User function Template for Java

class Solution {
    // Function to find element with more appearances between two elements in an
    // array.
    public int majorityWins(int arr[], int n, int x, int y) {
        // code here
        int frex=0,frqy=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x) frex++;
            if(arr[i]==y) frqy++;
        }
        if(frex>frqy) return x;
        if(frex<frqy) return y;
        else
        {
            return Math.min(x,y);
        }
    }
}
