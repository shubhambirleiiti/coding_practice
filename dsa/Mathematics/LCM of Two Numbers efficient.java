class LCM_efficient
{
    public static void main(String[]args)
    {
        int a=15,b=60;
        System.out.println(lcm_efficient(a,b));
    }
    static int lcm_efficient(int a,int b)
    { 
        return (a * b) / gcd_euclidean(a, b);
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
