//Write a program to create a basic calculator for addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
import java.util.*;
class l2q1
{
    public static void main()
    {
        try(Scanner sc=new Scanner(System.in))
        {
            float num1, num2;
            System.out.print("Enter Number 1 : ");
            num1=sc.nextFloat();
            System.out.print("Enter Number 2 : ");
            num2=sc.nextFloat();
            System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and "+num2+" is "+(num1+num2)+","+(num1-num2)+","+(num1*num2)+" and "+(num1/num2));
        }
    }
}