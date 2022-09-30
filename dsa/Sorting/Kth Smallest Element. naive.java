import java.util.Arrays;

class Kth_smallest
{
public static void main(String[]args)
{
    int arr[]= new int[]{12,4,5,31,67,16};
    int k=2;
    int n=arr.length;
    System.out.println(kth_smallest(arr,k,n));

}
static int kth_smallest(int arr[],int k,int n)
{   
    Arrays.sort(arr);
    return arr[k-1];
}
}
