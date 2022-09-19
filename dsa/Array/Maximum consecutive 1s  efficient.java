import java.util.*;
import java.io.*;
import java.lang.*;
class Consecutive_max_effi
{ 
 
   static int maxConsecutiveOnes_effi(int arr[], int n)
   {
      int res = 0;int curr=0,result=0;
      
      for(int i = 0; i < n; i++)
      {
         if(arr[i]==0)
         {
            curr=0;
         }
         else
         {
            curr++;
         }
         result=Math.max(result, curr);
      }
      
      return result;
   }

    public static void main(String args[]) 
    { 
       int arr[] = {0, 1, 1, 1, 1, 0, 1}, n = 7;
       System.out.println(maxConsecutiveOnes_effi(arr, n));
    } 

}



