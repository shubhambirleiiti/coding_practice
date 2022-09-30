class Union_Efficient
{
    static void union_Efficient(int a[],int b[],int m,int n)
    {
        int i=0,j=0;
        while(i<m && j<n)
        {
            if(i>0 && a[i]==a[i-1]) continue;
            if(j>0 && b[j]==b[j-1]) continue;
            if(a[i]<b[j]) {System.out.println(a[i]); i++;}
            else if(a[i]>b[j]){ System.out.println(b[i]); j++;}
            else {System.out.println(a[i]); i++;j++;}

        }
        while(i<m)
        {
            if(i>0 || a[i]!=a[i-1]) System.out.println(a[i]);i++;
        }
        while(j<n)
        {
            if(j>0 ||  b[j]!=b[j-1])  System.out.println(b[j]);j++;
        }
     }
public static void main (String[] args) 
    {
    int a[] = new int[]{3,8,10};
    int b[] = new int[]{2,8,9,10,15};
    
    int m = a.length;
    int n = b.length;
    union_Efficient(a,b,m,n);
   
     }
}