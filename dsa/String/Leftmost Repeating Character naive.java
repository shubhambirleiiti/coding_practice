class Leftmost_repeating
{
    public static void main(String[]args)
    {
        String str="abccdcs";
        System.out.println(Leftmost_repeating(str));
    }
    static int  Leftmost_repeating(String str)
    {
        for(int i=0;i<str.length();i++)
          {
            for(int j=i+1;j<str.length();j++)
            {
               if(str.charAt(i)==str.charAt(j))
               {
                return i;
               }
            }
          }
          return -1;
    }
}