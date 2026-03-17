/* Task 2 – String Handling
Write a Java program to:
● Take a string input
● Print:
○ Reverse string
○ Number of vowels
○ String length
Skills Checked
● String methods
● Loops */

package task2;

import java.util.Scanner;

public class StringHandling {

    // Reverse String
    static String reverse(String str) {
        StringBuilder rev = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }

        return rev.toString();
    }

    // Count Vowels
    static int countVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ("aeiouAEIOU".indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("String length is " + str.length());

        String reversed = reverse(str);
        System.out.println("Reverse String: " + reversed);

        int vowels = countVowels(str);
        System.out.println("Number of vowels: " + vowels);

        sc.close();
    }
}