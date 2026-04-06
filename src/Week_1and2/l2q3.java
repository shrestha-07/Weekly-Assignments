//Write a program to find the side of the square whose parameter you read from the user 
import java.util.*;
class l2q3
{
    public static void main()
    {
        try(Scanner sc=new Scanner(System.in))
        {
            double par, side;
            System.out.print("Enter the parameter : ");
            par=sc.nextDouble();
            side=par/4;
            System.out.println("The length of the side is "+side+" whose parameter is "+par);
        }
    }
}