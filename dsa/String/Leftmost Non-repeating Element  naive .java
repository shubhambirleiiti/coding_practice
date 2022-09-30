class Leftmost_non_repeating
{
    static int Leftmost_non_repeating(String str)
    {
        for(int i=0;i<str.length();i++)
        {   boolean flage=false;
            for(int j=0;j<str.length();j++)
            {
                if(i!=j && str.charAt(i)==str.charAt(j))
                {
                    flage=true;
                    break;

                }       
            }
            if(flage==false)
            {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]) 
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(Leftmost_non_repeating(str));  
    } 
 
}