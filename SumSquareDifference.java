public class SumSquareDifference {
    public static void main(String args[])
    {
        int n=100, sumOfSquare=0, squareOfSum=0, Sum=0;

        for(int i=1;i<=n;i++)
        {
            sumOfSquare+=i*i;
            Sum+=i;
        }
        squareOfSum=Sum*Sum;
        System.out.println(java.lang.Math.abs(squareOfSum-sumOfSquare));
    }
}

