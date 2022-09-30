import javax.lang.model.util.ElementScanner6;

class Leftmost_non_repeating_better
{    final static int CHAR=256;
    static int Leftmost_non_repeating(String str)
    {
       int []count=new int[CHAR];
       for(int i=0;i<str.length();i++)
       {
        count[str.charAt(i)]++;

       }
       for(int j=0;j<str.length();j++)
       {
        if(count[str.charAt(j)]==1) return j;
       }
       return -1;
    }

    public static void main(String args[]) 
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(Leftmost_non_repeating(str));  
    } 
 
}