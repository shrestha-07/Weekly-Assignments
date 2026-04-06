//Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
import java.util.*;
class l2q5
{
    public static void main()
    {
        try(Scanner sc=new Scanner(System.in))
        {
            double unitPrice, price; int quantity;
            System.out.print("Enter the MRP : ");
            unitPrice=sc.nextDouble();
            System.out.print("Number of items bought : ");
            quantity=sc.nextInt();
            price=unitPrice*quantity;
            System.out.println("The total purchase price is INR "+price+" if the quantity is "+quantity+" and unit price is INR "+unitPrice);
        }
    }
}