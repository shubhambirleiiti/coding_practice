
class Prime_effi
{
    public static void main(String[]args)
    {
        int n=41;
        System.out.print(prime_effici_ee(n));
    }
    static boolean prime_effici_ee(int n)
    {
        if(n==1) return true;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0) return false;
        }  
        return true;
    }
}
