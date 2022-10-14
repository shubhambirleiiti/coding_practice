package Problem;

//User function Template for Java

class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
    if(d==0 || d%arr.length==0)
        return;
      d = d%arr.length;
        rotatearray(arr,0,d-1);
        rotatearray(arr,d,n-1);
        rotatearray(arr,0,n-1);
    }
   static void  rotatearray(int arr[],int low,int high)
   {
      while(low<high)
      {
          int temp=arr[low];
          arr[low]=arr[high];
          arr[high]=temp;
          high--;
          low++;
      }
      
   }
}
