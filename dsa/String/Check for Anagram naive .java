import java.util.*;
class Anagram
{
    public static void main(String[]args)
    {   Scanner sc=new Scanner(System.in);
      
        String s1=sc.next();
        String s2=sc.next();
        
         System.out.println(find_anagram(s1,s2));
    }
    static boolean find_anagram(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        char[]a1=s1.toCharArray();
        Arrays.sort(a1);
        s1=new String(a1);
        char []a2=s2.toCharArray();
        Arrays.sort(a2);
        s2=new String(a2);
        return s1.equals(s2);
    }

}