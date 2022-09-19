import java.util.*;
import java.io.*;
class Max_sbarr_longest
{
    static int Max_sbarr_longest(int arr[], int n)
    {   int sum=0,cursum=0;
        for(int i=0;i<n;i++)
        { 
            if((arr[i]+arr[i+1])%2==0)
            {   cursum=0;
                break;
            }
            else
            {
                cursum+=(arr[i]+arr[i+1]);
            }
        }
        return cursum;
    }
    public static void main(String[]args)
    {
        int arr[] = {5,10,20,6,3,8}, n = 6;

        System.out.println(Max_sbarr_longest(arr, n));
    }
}
