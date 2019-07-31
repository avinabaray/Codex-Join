public class SpecialPythagoreanTriplet {
    public static void main(String args[])
    {
        int s = 1000, c;

        for(int a=3; a<=(s-3)/3; a++){
            for(int b=a+1; b<(s-a)/2; b++){
                c=s-a-b;
                if (c*c == a*a + b*b){
                    System.out.print(a*b*c);
                }
            }
        }
    }
}
