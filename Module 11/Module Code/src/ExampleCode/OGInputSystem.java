package ExampleCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// In this class, the OG way to get user's input + code uses catching of exceptions.
public class OGInputSystem {
    private static String message;

    public static void main(String[] args) {
        System.out.println("Enter your message: ");

        // OG User Input System
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try { // Catching the exception if no input.
            message = reader.readLine();
        } catch (IOException ex) {
            System.out.println("Input Missing. " + ex.getMessage());
        }

        // Output
        System.out.println("Your message: " + message);
    }
}
