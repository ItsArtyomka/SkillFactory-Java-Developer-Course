package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // Variable.
        String name = "";

        // Program tells the user instructions.
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        System.out.println("| Enter you name: |");
        System.out.println("~~~~~~~~~~~~~~~~~~~");

        // Overcomplicated way to get user input.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // try/catch IOException.
        try {
            name = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("Input Error " + e.getMessage());
        }

        // Output.
        System.out.print("| ");
        System.out.print("Hello!");
        System.out.print(" " + name);
        System.out.print(" |");
    }
}
