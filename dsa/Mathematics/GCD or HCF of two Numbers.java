
class gcd_hcf
{
    public static void main(String[]args)
    {
        int x=30,y=180;
        System.out.println(find_gcd(x,y));
    }
    static int find_gcd(int x,int y)
    {
        int res;
        if(x>y) res=y;
        else res=x;
        for(int i=res;i>0;i--)
        {
            if(x%i==0 && y%i==0)
            {   
                return i;
         
            }     
            
        }
        return 1;
     
    
    }

}