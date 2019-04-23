import java.math.BigInteger;

public class LargestPrimeFactor
{
	public static void main(String args[])
	{
		BigInteger n=new BigInteger("600851475143");
		for(BigInteger i=new BigInteger("2"); i.compareTo(n)<0; i=i.add(BigInteger.ONE))
		{
			while(n.remainder(i).equals(BigInteger.ZERO))
			{
				n=n.divide(i);
			}
		}
		System.out.println(n);
	}
}