/* Task 4 – ArrayList Practice

Create a program to:
● Store 5 student names in ArrayList

● Print all names

● Search a name entered by user

Skills Checked

● Collections

● Loops

● Logic

Iske acording code chahia */ 
    
package task4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Store 5 student names
        names.add("Yash");
        names.add("Rahul");
        names.add("Amit");
        names.add("Neha");
        names.add("Priya");

        // Print all names
        System.out.println("Student Names:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter name to search: ");
        String search = sc.nextLine();

        // Search name
        boolean found = false;

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals(search)) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("Name found in the list");
        } else {
            System.out.println("Name not found in the list");
        }

        sc.close();
    }
}
