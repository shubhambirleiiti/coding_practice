class Intersection_of_sotred_array
{
    static void intersection_of_sotred_array(int a[],int b[],int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            if(i>0 && a[i]==a[i-1])
            {
                continue;
            }
            for(int j=0;j<n;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.println(a[i]);
                    break;
                }
            
            }
        }
    }
public static void main (String[] args) 
{
    int a[] = new int[]{3,5,10,10,10,15,15,20};
    int b[] = new int[]{5,10,10,15,30};
    
    int m = a.length;
    int n = b.length;
    intersection_of_sotred_array(a,b,m,n); 
}
}