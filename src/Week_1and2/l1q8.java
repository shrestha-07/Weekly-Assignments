//Create a program to convert distance in kilometers to miles.
import java.util.*;
class l1q8
{
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            double km=sc.nextDouble();
            double mile=km*0.625;
            System.out.println("The total miles is " + mile + " mile for the given " + km + " km.");
        }
    }
}