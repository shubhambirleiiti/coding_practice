
import java.util.*;
import java.io.*;
import java.lang.*;

class Node{
        int data;
        Node prev;
        Node next;
        Node(int d){
            data=d;
            prev=null;
            next=null;
        }
    }
  
class Test { 
    
    public static void main(String args[]) 
    { 
        Node head=new Node(10);
    	Node temp1=new Node(20);
    	Node temp2=new Node(30);
    	head.next=temp1;
    	temp1.prev=head;
    	temp1.next=temp2;
    	temp2.prev=temp1;
    	head=deltail(head);
    	printlist(head);
    	
    } 
    public static void printlist(Node head)
    {
     Node curr=head;
     while(curr!=null){
     System.out.print(curr.data+" ");
     curr=curr.next;
     }
    static Node deltail(Node head)
    {
        Node curr=head;
        if(head==null) return null;
        if(head.next==null) return null;
        else
        {
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.prev.next=null;
            curr=null;
            
        }
        return head;
    }
 }
