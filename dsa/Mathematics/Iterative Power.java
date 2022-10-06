
class Iterative_power
{
    public static void main(String[]args)
    {  int x=4,n=5;
     System.out.println(iterative_power(x,n));
    }
    static int  iterative_power(int x,int n)
    {

        int res=1;
        while(n>0)
        {
            if(n%2!=0)
            {
                res=res*x;
            }
            x=x*x;
            n=n/2;
        }
        return res;

    }
}