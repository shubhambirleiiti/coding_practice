import java.util.*;
import java.io.*;
import java.lang.*;
class Sliding_window_technique
{ 

    static int maxSum(int arr[], int n, int k)
    {
        int res=0;
        for(int i=0;i+k-1<n;i++)
        {
                 int curr=0;
                 for(int j=0;j<k;j++)
                 {
                    curr+=arr[i+j];
                 }
                 res=Math.max(curr,res);
        }
        return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {1, 8, 30, -5, 20, 7}, n = 6, k = 3;

       System.out.println(maxSum(arr, n, k));

    } 

}