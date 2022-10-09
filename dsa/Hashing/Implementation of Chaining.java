package dsa.Hashing;

import java.util.ArrayList;
import java.util.*;

class Myhash
{   int BUCKET;
    ArrayList<LinkedList<Integer>> table;
    Myhash(int b)
    {   BUCKET=b;
        table=new ArrayList<LinkedList<Integer>>();
        for(int i=0;i<b;i++)
        {
            table.add(new LinkedList<Integer>());
        }

    }
    void insert(int k)
    {
        int i=k%BUCKET;
        table.get(i).add(k);
    }
    boolean search(int k)
    {
        int i=k%BUCKET;
        return table.get(i).contains(k);
    }
    void delete(int k)
    {
        int i=k%BUCKET;
        table.get(i).remove(k);
    }
}
class Imple_chaini
{
    public static void main(String[]args)
    {
        Myhash mh=new Myhash(7);
        mh.insert(10);
        mh.insert(30);
        mh.insert(60);
        System.out.println(mh.search(30));
        mh.delete(60);
        System.out.println(mh.search(60));
    }
}