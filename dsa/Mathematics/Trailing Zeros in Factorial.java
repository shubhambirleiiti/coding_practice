
class Trailling_zeros
{
    public static void main(String[]args)
    {
        int x=10;
        System.out.println(trailing_zeros(x));
    }
    static int trailing_zeros(int x)
    {   int res=0;
        int fact=1;
        for(int i=1;i<=x;i++)
        {
             fact=fact*i;
        }
        while(fact%10==0)
        {
            res++;
            fact=fact/10;
        }

        return res;
    }
}
