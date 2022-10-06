import javax.naming.spi.DirStateFactory.Result;

class Computing_power
{
    public static void main(String[]args)
    {
     System.out.println(computing_power(3,4));
    }
    static int computing_power(int x,int n)
    {   int res=1;
        for(int i=1;i<n;i++)
        {
            res=res*n;
        }
        return res;
    }
}
