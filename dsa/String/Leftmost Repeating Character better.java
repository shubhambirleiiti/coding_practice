
class Leftmost_repeating_better
{   static final int CHAR=256;
    public static void main(String[]args)
    {
        String str="geeksforgeeks";
        System.out.println(Leftmost_repeating(str));
    }
    static int Leftmost_repeating(String str)
    {   int []count=new int[CHAR];
        for(int i=0;i<str.length();i++ )
        {
           count[str.charAt(i)]++;
        }
        for(int j=0;j<str.length();j++)
        {
            if(count[str.charAt(j)]>1) return j;
        }
        return -1;
    }
}