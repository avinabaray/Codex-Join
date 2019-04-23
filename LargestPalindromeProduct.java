public class LargestPalindromeProduct
{
	public static void main(String args[])
	{
		int pal=0, n, maxPal=0, product;
		for(int i=999;i>=0;i--)
		{
			for(int j=999;j>=0;j--)
			{
				pal=0;
				product=i*j;
				n=product;
				while(n>0)
				{
					pal=pal*10+n%10;
					n=n/10;
				}	
				if(product==pal && pal>maxPal)
				{
					maxPal=pal;
				}
			}
		}
		System.out.println("Largest Palindrome Number: "+maxPal);
	}
}