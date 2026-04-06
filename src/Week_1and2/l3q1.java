//Write a TemperaturConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit
import java.util.*;
class l3q1
{
    public static void main()
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter the temperature in Celsius : ");
            double celsius=sc.nextDouble();
            double fahrenheit=(celsius*9/5)+32;
            System.out.println("The "+celsius+" celcius is "+fahrenheit+" fahrenheit.");
        }
    }
}