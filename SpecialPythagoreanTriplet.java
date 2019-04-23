public class SpecialPythagoreanTriplet {
    public static void main(String args[])
    {
        int a=0,b=0,c=0, flag=0;


        for(a=1;a<=1000;a++)
        {
            for(b=1;b<=1000;b++)
            {
                for(c=1;c<=1000;c++)
                {
                    if(a*a+b*b==c*c && a+b+c==1000)
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag==1)
                    break;
            }
            if(flag==1)
                break;
        }
        System.out.println(a*b*c);
    }
}
