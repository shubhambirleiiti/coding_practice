class Queue
{   int cap,size,arr[];
    Queue(int x)
    {
        size=0;
        cap=x;
        arr=new int[cap];
    }
    void enque(int x)
    {
        if(isfull()) return;
        arr[size]=x;
        size++;

    }
    void deque(){
        if(isempty()) return;
        for(int i=0;i<size-1;i++)
        {
            arr[i]=arr[i+1];
        
        }
        size--;
    }
    int getfront(){
        if(isempty())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    
    }
    int getrear(){
        if(isempty())
        {
            return -1;
        }
        else
        {
            return size-1;
        }
    }
    boolean isfull(){ return (size==cap);}
    boolean isempty(){ return (size==0);}
    int size(){}
    static void queue_implimentation(int []arr,int n)
    {
       
    }
    public static void main(String[]args)
    {
        int []arr=new int[5];
        queue_implimentation(arr,arr.length);
    }
}