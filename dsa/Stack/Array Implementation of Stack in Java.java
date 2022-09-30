import java.io.*;
import java.util.*;

class Array_implemetation
{
    public static void main(String args[])
    {
        MyStack s=new MyStack(5);
        s.push(12);
        s.push(15);
        System.out.println(s.peak());
        System.out.println(s.pop());
        s.push(34);
        System.out.println(s.size());
        System.out.println(s.isempty());
    }
} 
class Mystack
{
    int arr[];
    int cap;
    int top;
    Mystack(int c)
    {
      top=-1;
      cap=5;
      arr=new int[cap];
    }
    void push(int x)
    {
        top++;
        arr[top]=x;
    }
    int pop()
    {
        int temp=arr[top];
        top--;
        return temp;
    }
    int size()
    {
        return top+1;
    }
    boolean isempty()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    int peak()
    {
        return top;
    }
 }  
