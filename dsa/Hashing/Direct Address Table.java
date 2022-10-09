package dsa.Hashing;

class DAT
{
    int [] table=new int[1000];
    void insert(int i)
    {
        table[i]=1;
    }
    void del(int i)
    {
        table[i]=0;
    }
    int search(int i)
    {
        return table[i];
    }
}
class Hashing
{
    public static void main(String[]args)
    {
        DAT dat=new DAT();
        dat.insert(20);
        dat.insert(40);
        dat.insert(50);
        dat.insert(120);
        System.out.println(dat.search(10));
        System.out.println(dat.search(20));
        dat.del(120);
        System.out.println(dat.search(120));

    }
}
