package Problem;

class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str)
    {
    //** Your code here
    //   int count=0;
    //   for(int i=0;i<str.length();i++)
    //  {
    //      if(str.charAt(i)=='1')
    //        {
    //            for(int j=i+1;j<str.length();j++)
    //            {   
    //                if(str.charAt(j)=='1') count++;
    //            }
    //        }
    //    }
    //    return count; **//
    int countone=0;int sum=0;
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)=='1') countone++;
    }
    sum=(countone*(countone-1)/2);
    return sum;
    }
}