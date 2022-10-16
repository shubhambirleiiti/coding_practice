package Problem;

class Solution
{
    //Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt)
    {
            // Your code here
        int j=0;
        for(int i=0;i<txt.length();i++)
        {  
            if(pat.charAt(j)==txt.charAt(i))
            {
                j++;
            }
            else
            {
                j=0;
            }
            if(j==pat.length())
            {
                return true;
            }
        }
        return false;
            
    }
    
}
