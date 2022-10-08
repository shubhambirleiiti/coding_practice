
class Prime_factor_naive
{
    public static void main(String[]args)
    {
        int n=450;

       prime_factor_naive(n);
    }
    static void prime_factor_naive(int n)
    {   int x;
        for(int i=2;i<n;i++)
        {
            if(isprime(i)) 
            {x=i;
            while(n%x==0)
            {
                System.out.println(i);
                x=x*i;
            }
        }
        }
    }
    static boolean isprime(int y)
    {
          if(y==1) return false;
          if(y==2 ||y==3) return true;
          if(y%2==0 || y%3==0) return  false;
          for(int i=5;i*i<y;i=i+6)
          {
            if(y%i==0 || y%(i+2)==0) return false;
          }
          return true;
    }
}
 