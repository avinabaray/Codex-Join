public class SmallestMultiple
{
	public static void main(String agrs[])
	{
		int flag=1, i=1;
		while(flag==1)
		{
			flag=0;
			for(int j=1;j<=20;j++)
			{
				if(i%j!=0)
				{
					flag=1;
					break;
				}
			}
			i++;
		}
		System.out.println("Smallest Multiple: "+(i-1));
	}
}