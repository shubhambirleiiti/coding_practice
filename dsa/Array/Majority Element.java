import java.util.*;
import java.io.*;
import java.lang.*;
class Majority_elemnet
{ 
    static int majority_elem(int arr [],int n)
    {    
         for(int i=0;i<n;i++)
         {  int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;   
                }

            }
            if(count>n/2) return count;  
         }
         return -1;
    }

      

public static void main(String args[]) 
{ 
   int arr[] = {8, 7, 6, 6, 2, 6, 6, 6}, n = 8;

   System.out.println(majority_elem(arr, n));

} 
}