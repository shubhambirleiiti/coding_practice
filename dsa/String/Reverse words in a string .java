class Reverse_word
{
    public static void main(String[]args)
    {
       String s="welcome to Indore";
       int n=s.length();
       char str[]=s.toCharArray();
       reverse_string(str,n);
       System.out.println(str);

    }
    static  void reverse_string(char [] str,int n)
    {   int start=0;
        for(int end=0;end<n;end++)
        {
            if(str[end]==' ')
            {
               reverse_word(str,start,end-1);
               start=end+1;
            }
        }
        reverse_word(str,start,n-1);
        reverse_word(str,0,n-1);
      
    }
    static void reverse_word(char []str,int low,int high)
    {
        while(low<high)
        {
            //swap
            char temp=str[low];
            str[low]=str[high];
            str[high]=temp;
            low++;
            high--;
        }
    }

}
