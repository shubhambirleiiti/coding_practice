import java.util.*;
import java.io.*;
import java.lang.*;
class Stock_1
{ 
    static int maxprofit(int arr[], int n)
    {   int max=arr[0],min=arr[0],profit,index=0;
    	for(int i = 0; i < n; i++)
    	{
           if(arr[i]<min)
           {
            min=arr[i];
            index=i;
           }
    	}
        System.out.println(min+" "+ index);
        for (int j=index;j<n;j++)
        {
            if(arr[j]>max )
            {
             max=arr[j];   
            }
         } 
        profit=max-min;
        return profit;
}

    public static void main(String args[]) 
    { 
       int arr[] = {1, 5, 3, 8, 12}, n = 5;

       System.out.println(maxprofit(arr, n));
    } 
}