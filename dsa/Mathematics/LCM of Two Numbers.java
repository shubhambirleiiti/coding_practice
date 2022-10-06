import java.util.*;
class LCM
{
    public static void main(String[]args)
    {
        int a=4,b=6;
        System.out.print(lcm_find(a,b));
    }
    static int lcm_find(int a,int b)
    {
       
        int res=Math.max(a,b);
        while(true)
        {
          if(res %a==0 && res%b==0) {return res;}
          res++;
        }
       
    }
}