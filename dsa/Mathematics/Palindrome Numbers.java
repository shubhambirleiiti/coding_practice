
class Palindrome
{
    public static void main(String[]args)
    {
        int x=14541;
        palindrome(x);
    }
    static void palindrome(int x)
    {
        int res=x;
        int rev=0;
        while(res!=0)
        {  
           int temp;
           temp=res%10;
           rev=rev*10+temp;
           res=res/10;

        }
        if(rev==x)
        {
        System.out.println("yes");}
        else{
            System.out.println("no");
        }
    }
}
