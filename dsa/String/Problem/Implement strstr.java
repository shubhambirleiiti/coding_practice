package Problem;

class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       int l=x.length();
       for(int i=0;i<s.length()-l+1;i++)
       {
           if(s.substring(i,i+l).equals(x))
           {
               return i;
           }
       }
       return -1;
    }

