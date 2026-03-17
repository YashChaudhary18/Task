/* Task 1 – Number Operations
Write a Java program to:
● Take a number as input
● Check if it is:
○ Even or Odd
○ Prime or Not
Skills Checked
● Conditions (if-else)
● Loops
● Basic logic */
package task1;
import java.util.*;

public class NumberOperations {

    // Method to check Prime
    static boolean isPrime(int n) {

        if (n <= 1) {
            return false; // 1 and below are not prime
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check Even/Odd
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        // Prime Check
        if (isPrime(number)) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is NOT Prime");
        }

        // Even/Odd Check
        if (isEven(number)) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

        sc.close();
    }
}