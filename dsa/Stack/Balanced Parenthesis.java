import java.io.*;
import java.util.*;

import javax.lang.model.util.ElementScanner6;
class Check_paranthesis
{
    public static void main(String[]args)
    {
        String str="({}})[]";
        if(check_paranthesis(str))
        {
            System.out.println("balanced");
        }
        else
        {
            System.out.println("not balanced");
        }

    }
    public static boolean matching(char a,char b){
        return (( a=='(' && b==')' )||( a=='[' && b==']' )||( a=='{' && b=='}' ));
    }
    static boolean check_paranthesis(String str)
    {
     
        Deque <Character>dq=new ArrayDeque<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{')
            {
                dq.add(str.charAt(i));
            }
            else 
            {
                if(dq.isEmpty()==true)
                {
                    return false;
                }
                else
                {
                    if((matching(dq.peek(),str.charAt(i)))==true)
                    {
                        return true;
                    }
                    else{
                        dq.pop();
                    }
                    
                }
            }
        }
        return (dq.isEmpty()==true);
    }
}