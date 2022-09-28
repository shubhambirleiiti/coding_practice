class Selection_sort_naive
{

    static void selection_sort_naive(int a[],int n)
    {   int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {   int min_ind=0;
            for(int j=1;j<n;j++)
            {
               if(a[j]<a[min_ind])
               {
                     min_ind=j;
               }
            } 
            temp[i]=a[min_ind];
            a[min_ind]=Integer.MAX_VALUE;      
        }
        for(int k=0;k<n;k++)
        {
            a[k]=temp[k];
        }
    }
       public static void main (String[] args) {
        int a[] = {2, 1, 6, 3};
        selection_sort_naive(a, 4);
        
        for(int i = 0; i < 4; i++){
            System.out.print(a[i] + " ");
        }
    }
}