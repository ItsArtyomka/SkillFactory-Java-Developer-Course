// Purpose of the code is accepting lines and printing them out with style aka depending on the formatter blueprint.

import java.util.ArrayList;

@SuppressWarnings("FieldMayBeFinal") // <-- To make the code look nice in the IDE.
public class CoolPrinter {
    //---Variables---
    public static String testString = "";
    private static ArrayList<String> lines = new ArrayList<String>();

    // Function that adds the line to the lines array.
    public static void add(String line) {
        lines.add(line);
    }

    // Implements a Formatter interface by having formatter object as an argument.
    public static void print(Formatter formatter) {
        // Checking if the testString is not empty.
        if (!testString.equals(""))
            System.out.println(testString);
        // Checking if formatter is null
        if (formatter == null) {
            print();
            return; // This line "prevents" NullPointerException
        }
        // Function that uses the formatter interface to print out the line with style.
        for (String line : lines) {
            System.out.println(formatter.format(line));
        }
        // Checking if the formatter's class is anonymous, this is from the exercise.
        if (!formatter.getClass().isAnonymousClass()) {
            System.out.println("BUT FORMATTER'S CLASS IS NOT ANONYMOUS...");
        }
    }

    // Cleaning the array and making it empty.
    public static void clear() {
        lines.clear();
    }

    // Print method without Formatter
    public static void print() {
        System.out.println("No Formatter - no print!");
    }

}