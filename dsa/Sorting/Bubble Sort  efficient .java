class Bublesort_efficiient{

    static void bubbleSort(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                       int temp=a[j];
                       a[j]=a[j+1];
                       a[j+1]=temp;
                       swapped =true;
                }
                
            }
            if(swapped==false)
            {
                break;
            } 

        }
        
 }
        public static void main (String[] args) {
            int a[] = {2, 1, 4, 3};
            bubbleSort(a, 4);
            
            for(int i = 0; i < 4; i++){
                System.out.print(a[i] + " ");
            }
        }
    }