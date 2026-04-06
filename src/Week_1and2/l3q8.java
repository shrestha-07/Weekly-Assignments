//Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
import java.util.*;
class l3q8
{
    public static void main()
    {
        try(Scanner sc=new Scanner(System.in))
        {
            double principal, rate, si; int time;
            System.out.print("Enter Principal Amount : ");
            principal=sc.nextDouble();
            System.out.print("Enter Rate : ");
            rate=sc.nextDouble();
            System.out.print("Enter Time : ");
            time=sc.nextInt();
            si=(principal*rate*time)/100;
            System.out.println("The Simple Interest is "+si+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
        }
    }
}