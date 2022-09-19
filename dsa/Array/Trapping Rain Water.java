import java.util.*;
import java.io.*;
import java.lang.*;
class Traping_rain_water
{ 
    

    static int traping_rain_water(int arr[], int n)
    {   int result=0;
        int lmax=0,rmax=0;
    	for(int i = 1; i < n-1; i++)
    	{
    		
            for(int j=0;j<i;j++)
            {
                lmax=arr[i];
                lmax=Math.max(lmax,arr[j]);
            }
            for(int k=i+1;k<n;k++)
            {
                rmax=arr[k];
                rmax=Math.max(rmax,arr[k]);
            }
            result+=Math.min(lmax,rmax)-arr[i];
        }
        return result;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {3,0,1,2,5}, n = 5;

       System.out.println(traping_rain_water(arr, n));

    } 

}


