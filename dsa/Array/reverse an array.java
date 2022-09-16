import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    static void reverse(int arr[], int n)
    {
    	int low = 0, high = n - 1;

    	while(low < high)
    	{
    		int temp = arr[low];

    		arr[low] = arr[high];

    		arr[high] = temp;

    		low++;
    		high--;
    	}
    }

    public static void main(String args[]) 
    { 
       int arr[] = {10, 5, 7, 30}, n = 4;
       reverse(arr, n);
       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 

}