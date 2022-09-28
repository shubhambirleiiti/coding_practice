class Search_infinite_size
{ 
static int bsearch(int arr[], int low,int high,int x)
{      if(low>high) return -1;
       int mid=(low+high)/2;
       if(arr[mid]==x)  return mid;
       else if(arr[mid]<x) return bsearch(arr, mid+1, high, x);
       else return bsearch(arr, low, mid-1, x);
}
static int search_infinite_size(int arr[],int x)
{       
        int i=1;
        if(arr[0]==x) return 0;
        while(arr[i]<x) 
        {
           i=i*2;
        }
        if(arr[i]==x)  return i;
        return bsearch(arr, i/2+1, i-1, x);       
}

public static void main(String args[]) 
{

    int arr[] = {1, 2, 3, 40, 50};

    int x = 40;

    System.out.println(search_infinite_size(arr, x));


} 

}