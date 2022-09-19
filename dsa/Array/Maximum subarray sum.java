import java.util.*;
import java.io.*;
class Max_sbarr_naive
{
    static int Max_sbarr(int arr[], int n)
    {   int ress=1;
        for(int i=0;i<n;i++)
        {    int curr=1;
            for(int j=i+1;j<n;j++)
            {
               if((arr[j]%2==0 && arr[j-1]%2!=0)||(arr[j]%2!=0 && arr[j-1]%2==0))
               {
                  curr++;
               }
               else{
                break;
               }
            }
            ress=Math.max(ress,curr);
        }
        return ress;
    }
    public static void main(String[]args)
    {
        int arr[] = {5, 10, 20, 6, 3, 8}, n = 6;

        System.out.println(Max_sbarr(arr, n));
    }
}