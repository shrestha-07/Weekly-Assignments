import java.util.*;
public class l1q3
{
    public static void main()
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int i,num;
            int[] table= new int[10];
            System.out.print("Enter the number : ");
            num=sc.nextInt();
            for(i=1;i<=10;i++)
                table[i-1]=num*i;
            for(i=0;i<10;i++)
                System.out.println(num+" x "+i+" = "+table[i]);
        }
    }
}