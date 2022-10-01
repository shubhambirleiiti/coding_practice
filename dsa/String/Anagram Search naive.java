
class Anagram_naive
{
    static final int CHAR=256;
    public static void main(String[]args)
    {
       String txt="geeksforgeeks";
       String pat="forgk";
       System.out.println(isanagram(txt,pat));
    }
    static Boolean isanagram(String txt,String pat)
    {
        int m=txt.length();
        int n=pat.length();
        for(int i=0;i<=m-n;i++)
        {
            if(are_Anagram(txt,pat,i)) 
            {
                return true;
            }
        }
        return false;
    }
    static boolean are_Anagram(String txt,String pat,int i)
    {  int count[]=new int[CHAR];
       for(int j=0;j<pat.length();j++)
       {
            count[pat.charAt(j)]++;
            count[txt.charAt(i+j)]--;
       }
       for(int j=0;j<CHAR;j++)
       {
        if(count[j]!=0) return false;
       }
       return true;
    }
    
}
