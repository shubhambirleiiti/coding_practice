package Problem;

class Solution {
    public static boolean searchPattern(String str, String pat) {
        // code here
        int n=str.length(),m=pat.length();
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i) == pat.charAt(0) && (n-i)>=m)
            {
                String check = str.substring(i, i+m);
                if(check.equals(pat)) return true;
            }
        }
        return false;
        }
}