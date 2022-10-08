
class All_divisor
{
    public static void main(String[]args)
    {
        int n=45;
        all_divisor(n);
    }
    static void all_divisor(int n)
    {
        for(int i=1;i<=n;i++)
        {   
            if(n%i==0)
            {
            System.out.println(i);
            }
        }
    }
}