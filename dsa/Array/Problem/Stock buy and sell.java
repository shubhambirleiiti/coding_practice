package Problem;

class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int arr[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> arrlist=new ArrayList<>();
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
            {
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(i-1);
                temp.add(i);
                arrlist.add(temp);
            }
        }
        return arrlist;
    }
}