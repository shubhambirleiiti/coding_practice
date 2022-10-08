package dsa.Recursion;

class Printing_permutation
{
    public static void main(String[]args)
    {
        String s="abc";
        printing_permutation(s,0);
    }
    static void printing_permutation(String s,int i)
    {

        if(i==s.length()-1) System.out.println(s);
        else
        {
            for(int j=i;j<=s.length()-1;j++)
            {
                s=swap(s,i,j);
                printing_permutation(s,i+1);
                s=swap(s,i,j);
            }
        }

    }
    static String swap(String a,int i,int j)
    {
        char temp;
        char [] carr=a.toCharArray();
        temp=carr[i];
        carr[i]=carr[j];
        carr[j]=temp;
        return String.valueOf(carr);

    }
}