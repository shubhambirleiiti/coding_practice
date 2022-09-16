import java.util.*;
import java.io.*;
import java.lang.*;
class Fre_sort_arr
{ 
    static int  frequency_sorted_list(int arr[], int n)
    {   int count=0;
        for (int i=1;i<n;i++)
        {
            if (arr[i-1]==arr[i])
            {
                count++;
            }
        }
        return count;
    } 
    public static void main(String args[]) 
    {  
       int arr[] = {7, 10, 4, 10, 6, 5, 2},n=arr.length;
       System.out.println(frequency_sorted_list(arr, n));
      
    } 

}
