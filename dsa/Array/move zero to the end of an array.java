import java.util.*;
import java.io.*;
import java.lang.*;
class Zeroend
{ 
    static void zeroend(int arr[], int n)
    {
    	for(int i = 0; i < n; i++)
    	{
    	    if(arr[i]==0)
            {
                for(int j=i;j<n;j++)
                {   if(arr[j]!=0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;}
                }
            }
    	}
    } 

    public static void main(String args[]) 
    {  

       int arr[] = {5,12,0,30,0,2,0,35},n=arr.length;
       zeroend(arr, n);
       for(int k=0;k<n-1;k++)
       System.out.println((arr[k] + " "));
    } 

}
