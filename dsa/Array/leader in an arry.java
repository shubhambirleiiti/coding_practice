import java.util.*;
import java.io.*;
import java.lang.*;
class Leader
{ 
    static void leaderinarr(int arr[], int n)
    {
    	for(int i=arr.length-1;i<=0;i--)
        {
           if (arr[i]<arr[i-1])
           {
            
           }
        }
    } 

    public static void main(String args[]) 
    {  

       int arr[] = {5,12,0,30,0,2,0,35},n=arr.length;
       leaderinarr(arr, n);
       for(int k=0;k<n-1;k++)
       System.out.println((arr[k] + " "));
    } 

}
