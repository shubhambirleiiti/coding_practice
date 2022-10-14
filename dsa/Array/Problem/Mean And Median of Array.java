package Problem;

class Solution
{
  //Function to find median of the array elements.  
  public int median(int A[],int N)
    {
       int median,index;
      
       Arrays.sort(A);
      
       if(N%2==0) 
       {
           return ((A[(N-1)/2] + A[N/2])/2);
       }
       else
       {
           return A[N/2];
       }
       
       
       //Your code here
       //If median is fraction then conver it to integer and return
    }
    //Function to find median of the array elements.
    public int mean(int A[],int N)
    {  int sum=0;
       //Your code here
       for(int i=0;i<N;i++)
       {
           sum+=A[i];
       }
       return sum/N;
    }

}