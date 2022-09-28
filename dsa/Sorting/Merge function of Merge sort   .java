import java.util.*;
import java.lang.*;
import java.io.*;

class Solution_merge_new
{
    public static void main (String[] args) 
    {
        int a[] = new int[]{10,15,20,40,8,11,15,22,25};
	    int l=0,h=8,m=3;
        
        merge(a,l,m,h);
	    for(int x: a)
	        System.out.print(x+" ");
     
        
    }
     static void merge(int a[],int l,int m,int h)
    {
        int n1=m-1+l,n2=h-m;
        int [] left=new int[n1];
        int [] right=new int[n2];
        for(int i=0;i<n1;i++)
        {
            left[i]=a[i+l];
        }
        for(int j=m+1;j<n2;j++)
        {
            right[j-n1]=a[j];
        }

    }
}
    