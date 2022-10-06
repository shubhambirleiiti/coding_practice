
class Factorial
{
    public static void main(String[]args)
    {
        int x=4;
        factorial(x);
    }
    static void factorial(int x)
    {   int fact=1;
        for(int i=1;i<=x;i++)
        {
           fact=fact*i;
        }
        System.out.println(fact);
    }
}