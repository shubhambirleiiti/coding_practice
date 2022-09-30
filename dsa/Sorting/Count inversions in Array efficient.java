class Count_inver_efficent
{
    static int count_inver_efficent(int []arr,int l,int r)
    {
       int result=0;
       if(l<r)
       {
        int m=(l+r)/2;
        result+=count_inver_efficent(arr, l, m);
        result+=count_inver_efficent(arr, m+1, r);
        result+=count_merge(arr,l,m,r);
       }
       return result;
    }
    static int count_merge(int arr[],int l,int m,int r)
    {
        int 
     return ;
    }
    
    public static void main (String[] args) 
    {
        int arr[] = new int[]{2,4,1,3,5};
        
        int n = arr.length;
	    System.out.println(count_inver_efficent(arr,0,n-1));
        
    }
}