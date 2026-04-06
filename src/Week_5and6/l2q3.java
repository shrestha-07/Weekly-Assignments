import java.util.*;
public class l2q3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();

            int largest = -1;
            int secondLargest = -1;

            if (num == 0) {
                largest = 0;
            }

            while (num > 0) {
                int digit = num % 10;

                if (digit > largest) {
                    secondLargest = largest;
                    largest = digit;
                } else if (digit > secondLargest && digit < largest) {
                    secondLargest = digit;
                }

                num /= 10;
            }

            System.out.println("Largest: " + largest);
            System.out.println("Second Largest: " + (secondLargest == -1 ? "None" : secondLargest));
        }
    }
}