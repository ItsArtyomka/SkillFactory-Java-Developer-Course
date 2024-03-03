import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        //---Ways to create an array.---

        int[] arr1; // Simple way to create an array.
        // OR
        int[] arr2 = new int[]{1, 2, 3}; // Creating memory for the array.
        // OR
        int[] arr3 = new int[10]; // Creating empty array with the length of 10.
        // OR
        int[] array1 = {1, 2, 3, 4};

        // Printing out the array, can be done using the Arrays class.
//        System.out.println(Arrays.toString(arr1)); // Cannot be printed out because the array is not initialised.
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(array1));

        //---Arrays with for loops.---
        for (int i = 0; i < array1.length; i++) {
            // Iterates through each element and prints it out.
            System.out.println(i + ": " + array1[i]);
        }

        // Also can be done with foreach loop:
        for (int item : arr2) {
            System.out.println(item); // Just prints out the 2nd item of the arr2.
        }
    }
}
