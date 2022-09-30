class Leftmost_repeating_efficient
{
    static final int CHAR=256;
    public static void main(String[]args)
    {
        String str="abccdcs";
        System.out.println(Leftmost_repeating(str));
    }
    static int Leftmost_repeating(String str)
    {   int result=-1;
        boolean []visited=new boolean[CHAR];
        for(int i=str.length()-1;i>=0;i--)
        {
             if(visited[str.charAt(i)])
             {
                result=i;
             }
             else
             {
                visited[str.charAt(i)]=true;
             }
            
        }
        return result;
    }
}