class Count_digit
{
    public static void main(String[]args)
    {
        int x=45896;
        count_digit(x);
    }
    static void count_digit(int x)
    {   int res=x;
        int count=0;
        while(res!=0)
        {   count++;
            res=res/10;

        }
        System.out.println(count);
    }
}