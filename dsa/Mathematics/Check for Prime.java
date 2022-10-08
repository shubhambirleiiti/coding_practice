
class Prime
{
    public static void main(String[]args)
    {
          int n=37;
          System.out.println(isprime(n));
    }
    
    static boolean isprime(int n)
    {   if(n==1) return true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0) return false;
        }

        return  true;
    }
}