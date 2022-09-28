
class Selection_sort_efficient
{

    static void selection_sort_efficient(int a[],int n)
    {  
        
        for(int i=0;i<n;i++)
        {
            int min_index=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[min_index])
                {
                    min_index=j;
                }
            }
            int temp =a[i];
            a[i]=a[min_index];
            a[min_index]=temp;



        }
    }
       public static void main (String[] args) {
        int a[] = {2, 1, 6, 3};
        selection_sort_efficient(a, 4);
        
        for(int i = 0; i < 4; i++){
            System.out.print(a[i] + " ");
        }
    }
}