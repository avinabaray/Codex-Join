public class EvenFibonacci
{
    public static void main(String args[])
    {
        long a=1, b=2, sum=0;
        while(b<4000000)
        {
            if(b%2==0)
            {
                sum+=b;
            }
            b=a+b;
            a=b-a;
        }
        System.out.println("Sum: "+sum);
    }
}

//test
