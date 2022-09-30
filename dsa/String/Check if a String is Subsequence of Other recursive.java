import java.util.*;

import javax.lang.model.util.ElementScanner6;
class find_subsequence
{
    static boolean isSubSeq(String s1,String s2,int m,int n)
    {
     if(m==0) return true;
     if(n==0) return false;
    if(s1.charAt(m-1)==s2.charAt(n-1))
    {
     return isSubSeq(s1, s2, m-1, n-1);
    }
    else 
    {
        return isSubSeq(s1, s2, m-1, n);
    }
    }
 
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, m;

    m = sc.nextInt();
    n = sc.nextInt();
    
    String s1, s2;
    s1 = sc.next();
    s2 = sc.next();
    
    System.out.println(isSubSeq(s1, s2,m,n));
    
}
}