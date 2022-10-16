package Problem;

class Solution
{   static int CHAR=256;
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
      //  System.out.println(are_anagram(a,b));
       int count[]=new int[CHAR];
       if(a.length()!=b.length()) return false;
       for(int i=0;i<a.length();i++)
       {
           count[a.charAt(i)]++;
           count[b.charAt(i)]--;
       }
       for(int j=0;j<CHAR;j++)
       {
           if(count[j]!=0) return false;
       }
       return true;
      
        
    }
}
