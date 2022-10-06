
class Trailling_zeros_eff
{
    public static void main(String[]args)
    {
      int x=30;
      System.out.println(trailling_zeros_eff(x));
    }
    static int trailling_zeros_eff(int x)
    {   int res=0;
        for(int i=5;i<=x;i=i*5)
        {
          res=res+x/i;
        }
        return res;
    }
}