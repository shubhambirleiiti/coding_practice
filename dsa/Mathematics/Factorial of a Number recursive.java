
class Factorial_recurs
{
    public static void main(String[]args)
    {
        int x=5;
        System.out.println(factorial_recurs(x));
    }
    static int  factorial_recurs(int x)
    {
        if(x==0) return 1;
        return x*factorial_recurs(x-1);
    }
    
}