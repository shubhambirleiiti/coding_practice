package Problem;
class Solution{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here
      
        int max=-1,max2=-1;
        for(int i=0;i<sizeOfArray;i++)
        {
            if(arr[i]>max)
            {
                max2=max;
                max=arr[i];
            }
            if(arr[i]>max2 && arr[i]!=max)
            {
                max2=arr[i];
            }
        }
    
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(max);
        al.add(max2);
        return al;
    }
}
