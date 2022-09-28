class Two_pointer_approch
{
    static boolean two_pointer_approch(int arr[],int n,int x)
    {
        int i=0,j=n-1;
        while(i<j)
        {
            
            if(arr[i]+arr[j]==x) {return true;}
            else if((arr[i]+arr[j])<x) i++;
            else  j--;
        
    }
        return false;
    }

	public static void main(String args[]) 
    {
        int arr[] = {2,5,8,12,30,34}, n = 6,x=12;
        

		System.out.println(two_pointer_approch(arr, n,x));

    } 

}
