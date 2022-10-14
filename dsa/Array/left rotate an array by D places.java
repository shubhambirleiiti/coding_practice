import java.util.*;
import java.io.*;
import java.lang.*;
class RotateD
{ 
    static void lroate(int arr[], int d,int n)
    {   
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    } 
    static void reverse(int arr[],int low,int high)
    {
             while(low<high)
             {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;high--;
             }
    }
    public static void main(String args[]) 
    { 
   
       int arr[] = {5, 12, 30, 2, 35}, d=2,n = arr.length;
       lroate(arr,d, n);
       for(int i=0;i<arr.length;i++)
       {
         System.out.println(arr[i]);
       } 
    }
}
