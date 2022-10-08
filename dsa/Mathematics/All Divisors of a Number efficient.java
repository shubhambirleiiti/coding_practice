
class All_divisor_effi
{
    public static void main(String[]args)
    {
        int n=45;
        all_divisor_effi(n);
    }
    static void all_divisor_effi(int n)
    {
        for(int i=1;i*i<n;i++)
        {
            if(n%i==0) 
            {
                System.out.println(i);
                if(i!=n/i)
                {
                    System.out.println(n/i);
                }
            }

        }
    }
}