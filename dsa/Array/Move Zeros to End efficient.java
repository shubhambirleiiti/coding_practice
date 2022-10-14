import java.util.*;
import java.io.*;
import java.lang.*;
class Zeroend_effic
{ 
    static void zeroend(int arr[], int n)
    {
    	int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
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