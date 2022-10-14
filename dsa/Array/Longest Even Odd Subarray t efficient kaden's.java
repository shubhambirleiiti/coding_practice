import java.util.*;
import java.io.*;
class Max_sbarr_efficient
{
    static int Max_sbarr(int arr[], int n)
    {   int ress=1;
        
       int curr=1;
            for(int j=1;j<n;j++)
            {
               if((arr[j]%2==0 && arr[j-1]%2!=0)||(arr[j]%2!=0 && arr[j-1]%2==0))
               {
                  curr++;
               }
               else{
                curr=1;
               }
            }
            ress=Math.max(ress,curr);
        
        return ress;
    }
    public static void main(String[]args)
    {
        int arr[] = {5, 10, 10, 1, 4, 3}, n = 6;

        System.out.println(Max_sbarr(arr, n));
    }
}
