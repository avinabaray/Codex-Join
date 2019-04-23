public class Prime10001st {
    static boolean isPrime(long i)
    {
        if(i<=1)
            return false;
        if(i<=3)
            return true;
        if(i%2==0 || i%3==0)
            return  false;
/*      for loop starts from least value of 6n+1 or 6n-1
        Here, we r checking if there is any factor of 'i' which is of the form 6n+-1
        for loop runs till square root of i
*/      for(int j=5; j*j<=i; j+=6)
        {
            if(i%j==0 || i%(j+2)==0)
                return false;
        }
//      if none of the above follows, then the no. is prime
        return true;
    }
    public static void main(String args[])
    {
        int count=1;
        long i=1, lastPrime=-1;
        while(count<=10001){
            if(isPrime(i))
            {
                lastPrime=i;
                count++;
            }
            i++;
        }
        System.out.println(lastPrime);
    }
}
