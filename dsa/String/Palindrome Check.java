class Plaindrome
{
    public static void main(String[]args)
    {
        String s1="madamm";
        System.out.println(palind(s1));
    }
    static boolean palind(String s1)
    {
      StringBuilder rev=new StringBuilder(s1);
      rev.reverse();
      return s1.equals(rev.toString());
    }
}