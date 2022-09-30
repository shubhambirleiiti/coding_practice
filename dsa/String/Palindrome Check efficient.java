class Plaindrome_efficient
{
    public static void main(String[]args)
    {
        String str="madamm";
       System.out.println(ispalindrome(str));
    }
    static boolean ispalindrome(String str)
    {
        int start=0,end=str.length()-1;
        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                return false;
            }
            start++;end--;
       
        }
        return true;
    }
}
