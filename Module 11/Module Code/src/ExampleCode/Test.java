package ExampleCode;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            readFromFile();
        } catch (IOException /* | FileNotFoundException */ e) { // Commented code causes compilation error.
            e.printStackTrace();
        }
        System.out.print("Done");
    }

    public static void readFromFile() throws IOException {
        System.out.print("Reading line ");
    }
}