/* Write a new program similar to the program # 6 but take user input for Student Fee and University Discount.

#6 : The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.
*/
import java.util.*;
class l1q9
{
    public static void main()
    {
        try(Scanner sc=new Scanner(System.in))
        {
            double discountamt, amt, discountPercent, fee;
            System.out.print("Enter fee amount : ");
            fee=sc.nextInt();
            System.out.print("Enter discount percent : ");
            discountPercent=sc.nextInt();
            discountamt=fee*(discountPercent/100);
            amt=fee-discountamt;
            System.out.println("The discount amount is INR "+discountamt+" and final discounted fee is INR "+ amt);
        }
    }
}