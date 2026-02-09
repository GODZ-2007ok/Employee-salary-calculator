package Recursive;
import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int result = sumDigits(n);
            System.out.println("Sum of digits of " + n + " is: " + result);
        }

        sc.close();
    }

    // Recursive method
    public static int sumDigits(int n) {
        if (n == 0)
            return 0;
        else
            return (n % 10) + sumDigits(n / 10);
    }
}
