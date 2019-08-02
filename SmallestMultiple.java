public class SmallestMultiple
{
	static int smallestMultiple(int first_number, int last_number){
		int lcm = first_number;
		for (int i=2; i<=last_number ;i++) {
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
		return lcm;
	}
	public static void main(String agrs[])
	{
		System.out.println(smallestMultiple(1,20));
	}
}
