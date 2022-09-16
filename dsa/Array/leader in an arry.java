import java.util.*;
import java.io.*;
import java.lang.*;
class Leader
{ 
    static void leaderinarr(int arr[], int n)
    {   int curldr=arr[n-1];
        System.out.print(curldr+" ");
    	for(int i = n - 2; i >= 0; i--)
    	{
    		if(curldr < arr[i])
    		{
    			curldr = arr[i];

    			System.out.print(curldr+" ");
    		}
    	}
    } 
    public static void main(String args[]) 
    {  
       int arr[] = {7, 10, 4, 10, 6, 5, 2},n=arr.length;
       leaderinarr(arr, n);
      
    } 

}
