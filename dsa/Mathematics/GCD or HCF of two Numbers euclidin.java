
class Gcd_euclidean
{
    public static void main(String[]args)
    {
        int a=12,b=40;
       System.out.print(gcd_euclidean(a,b));
    }
    static int gcd_euclidean(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }
        return  a;
    }
}
