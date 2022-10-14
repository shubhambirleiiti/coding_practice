import java.util.*;
import java.io.*;
import java.lang.*;
class Majority_elemnet_efficient
{   int res=1;
    static int majority_elem(int arr [],int n)
    {    int  res=0,count=1;
         for(int i=0;i<n;i++)
         {
           if(arr[res]==arr[i]) count++;
           else count--;
           if(count==0) {res=i;count=1;}
         }
         count=0;
         for (int i=0;i<n;i++)
         {
            if(arr[res]==arr[i]) count++;
           
         }
         if(count>n/2) return count;
         else return -1;
    }
public static void main(String args[]) 
{ 
   int arr[] = {8, 7, 6, 6, 2, 6, 6, 6}, n = 8;

   System.out.println(majority_elem(arr, n));

} 
}