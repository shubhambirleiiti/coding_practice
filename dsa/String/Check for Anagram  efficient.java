import java.util.*;
class find_anagram_efficient
{
    static final int CHAR=256;
    public static void main(String[]args)
    {   Scanner sc=new Scanner(System.in);
      
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(find_anagram(s1,s2));
    }

static boolean find_anagram(String s1,String s2)
{   int []count=new int[CHAR];
    if(s1.length()!=s2.length()) return false;
    for(int i=0;i<s1.length();i++)
    {
      count[s1.charAt(i)]++;
      count[s2.charAt(i)]--;
    }
    for(int i=0;i<CHAR;i++){
        if(count[i]!=0)return false;
    }
    return true;
}
}