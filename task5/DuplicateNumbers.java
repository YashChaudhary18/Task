/* Task 5 – Duplicate Numbers
Given array:
int arr[] = {1,2,3,2,5,1};
Print duplicate numbers.
Skills Checked
● Logic
● Loops
● Problem solving */
package task5;

public class DuplicateNumbers {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 2, 5, 1};

        System.out.println("Duplicate numbers are:");

        // Loop to find duplicates
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // avoid printing same duplicate multiple times
                }
            }
        }
    }
}