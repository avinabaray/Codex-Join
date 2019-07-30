public class SmallestMultiple
{
	public static void main(String agrs[])
	{
		int first_number = 1, lcm = first_number;
		for (int i=2; i<=20 ;i++) {
			int second_number = i;
			lcm = (first_number > second_number) ? first_number : second_number;

			while (true) {
				if (lcm % first_number == 0 && lcm % second_number == 0) {
					first_number = lcm;
					break;
				}
				++lcm;
			}
		}
		System.out.println(lcm);
	}
}
