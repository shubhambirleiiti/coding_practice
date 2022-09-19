import java.util.*;
import java.io.*;
import java.lang.*;
class Minimum_conse_flip_efficient
{   int res=1;
    static void minimum_conse_flip_efficient(int arr [],int n)
    {    
         for(int i=1;i<n;i++)
         {
           if(arr[i]!=arr[i-1])
            {
            if(arr[i]!=arr[0])
            {
                System.out.print("from "+" "+i+" to ");
            }
            else
            {
                System.out.println(i-1);
            }
            }
         }
         if(arr[n-1]!=arr[0])
         {
            System.out.println(n-1);
         }
    }

      

public static void main(String args[]) 
{ 
    int arr[] = {0, 0, 1, 1, 0, 0, 1, 1, 0}, n = 9;

   minimum_conse_flip_efficient(arr, n);

} 
}
