import java.util.*;
import java.io.*;
import java.lang.*;
class Fre_sort_arr
{ 
    static void  frequency_sorted_list(int arr[], int n)
    {   int freq=1,i=1;
        while(i<n)
        {   while(i<n && arr[i]==arr[i-1])
            {
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" "+freq);
            freq=1;i++;
        }
    } 
    public static void main(String args[]) 
    {  
       int arr[] = {10 ,10, 30, 30, 60, 60},n=arr.length;
       frequency_sorted_list(arr, n);
      
    } 

}
