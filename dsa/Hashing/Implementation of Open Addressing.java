package dsa.Hashing;


class Myhash
{   int arr[];
    int cap,size;
    Myhash(int c)
    {
        cap=c;
        size=0;
        arr=new int [cap];
        for(int i=0;i<cap;i++)
        {
            arr[i]=-1;
        }
    }
    int hash(int key)
    {
        return key%cap;
    }
    boolean insert(int key)
    {
        if(size==cap)
        {
            return false;
        }
        int i=hash(key);
        while(arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key)
        i=(i+1)%cap;
        if(arr[i]==key)
            return false;
        else{
            arr[i]=key;
            size++;
            return true;
        }
    }
    boolean erase(int key)
    {
        int h=hash(key);
        int i=h;
        while(arr[i]!=-1){
            if(arr[i]==key){
                arr[i]=-2;
                return true;
            }
            i=(i+1)%cap;
            if(i==h)
                return false;
        }
        return false;
    }
    boolean search(int key)
    {
        int h=hash(key);
        int i=h;
        while(arr[i]!=-1){
            if(arr[i]==key)
                return true;
            i=(i+1)%cap;
            if(i==h)
                return false;
        }
        return false;
    }


    public static void main(String[]args)
    {
        Myhash mh=new Myhash(7);
        mh.insert(20);
        mh.insert(40);
        mh.insert(60);
        mh.insert(80);
        if(mh.search(40)==true)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        if(mh.search(80)==true)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }

    }
}