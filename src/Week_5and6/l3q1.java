import java.util.*;

public class l3q1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            long num = sc.nextLong();
            num = Math.abs(num);

            String temp = Long.toString(num);
            int count = temp.length();

            int[] digits = new int[count];
            long n = num;
            for (int i = count - 1; i >= 0; i--) {
                digits[i] = (int) (n % 10);
                n /= 10;
            }

            int[] frequency = new int[10];
            for (int i = 0; i < count; i++) {
                int digitValue = digits[i];
                frequency[digitValue]++;
            }

            System.out.println("Digit Frequency:");
            for (int i = 0; i < 10; i++) {
                if (frequency[i] > 0) {
                    System.out.println("Digit " + i + ": " + frequency[i]);
                }
            }
        }
    }
}