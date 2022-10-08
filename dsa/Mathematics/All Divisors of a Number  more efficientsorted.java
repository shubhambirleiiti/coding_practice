

class All_divisor_effi_sorted
{
    public static void main(String[]args)
    {
        int n=45;
        all_divisor_effi_sorted(n);
    }
    static void all_divisor_effi_sorted(int n)
    {    int i=1;
        for(i=1;i*i<n;i++)
        {
            if(n%i==0) 
            {
                System.out.println(i);
                
            }
        }
       
        for(;i>=1;i--)
        {
            if(n%i==0)
                {
                    System.out.println(n/i);
                }
        }
    }
}
