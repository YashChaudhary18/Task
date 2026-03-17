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