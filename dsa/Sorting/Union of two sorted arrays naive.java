import java.util.Arrays;

class Union_naive
{
    static void union_naive(int a[],int b[],int m,int n)
    {   int c[]=new int[m+n];
        for(int i=0;i<m;i++)
        {
          c[i]=a[i];
        }
        for(int j=0;j<n;j++)
        {
           c[j+m]=b[j];
        }    
        Arrays.sort(c);
        for(int k=0;k<m+n;k++)
        {
            if(k==0||c[k]!=c[k-1])
            {
                System.out.println(c[k]);
            }
        }
}
public static void main (String[] args) 
{
    int a[] = new int[]{3,8,10};
    int b[] = new int[]{2,8,9,10,15};
    
    int m = a.length;
    int n = b.length;
    union_naive(a,b,m,n);
    
}
}