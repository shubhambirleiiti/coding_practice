import java.util.*;
import java.io.*;
import java.lang.*;
class Maxdifffer
{ 
    static int maxdifffer(int arr[], int n)
    {   int result=arr[1]-arr[0],minval=arr[0];
    	for(int i = 0; i < n; i++)
    	{
    	    result=Math.max(result,arr[i]-minval);
            minval=Math.min(arr[i],minval);
        }
    	return result;
    } 
    public static void main(String args[]) 
    { 
       int arr[] = {5, 12, 30, 2, 35}, n = 5;

    System.out.println(maxdifffer(arr, n));
    } 
}
