/* Task 3 – Student Class
Create a class Student with:
● id
● name
● marks
Requirements:
● Constructor
● Getter & Setter
● Method to display student details
Skills Checked
● OOP basics
● Class and Objects */

package task3;

public class Main {

    public static void main(String[] args) {

        Student st = new Student(1, "Yash", 72.5);

        st.displayDetails();

        // Using setter
        st.setMarks(80.0);

        System.out.println("\nAfter Updating Marks:");
        st.displayDetails();
    }
}
