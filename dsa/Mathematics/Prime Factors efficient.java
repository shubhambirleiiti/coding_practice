

class Prime_factor_efficient
{
    public static void main(String[]args)
    {
        int n=84;

       prime_factor_efficie(n);
    }
    static void prime_factor_efficie(int n)
    {   
        if(n<=1) return ;
        for(int i=2;i*i<=n;i++)
        {
            while(n%i==0)
            {
                System.out.println(i);
                n=n/i;
            }
          
        }
        if(n>1)
        {
            System.out.print(n);
        }

    }
}