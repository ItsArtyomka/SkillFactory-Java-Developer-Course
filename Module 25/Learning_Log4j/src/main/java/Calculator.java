import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    private static final Scanner userInput = new Scanner(System.in);
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static void main(String[] args) throws IOException {
        // User Input
        int firstInput = userInput.nextInt();
        logger.info("User Input First Variable: " + firstInput);
        int secondInput = userInput.nextInt();
        logger.info("User Input Second Variable: " + secondInput);
        System.out.println("Enter an operation: ");
        String operation = userInput.next();
        logger.info("User Input Operation:" + operation);

        // Calculation
        switch (operation) {
            case "+":
                firstInput = getSum(firstInput,secondInput);
                break;
            case "-":
                firstInput = getSub(firstInput,secondInput);
                break;
            case "*":
                firstInput = getProduct(firstInput,secondInput);
                break;
            case "/":
                if (secondInput == 0) {
                    logger.fatal("Can't Division By 0");
                    firstInput = 0;
                } else {
                    firstInput = getDiv(firstInput,secondInput);
                }
                break;
        }

        // Output
        logger.info("Result = " + firstInput);
        System.out.println("Result is " + firstInput);
    }

    static int getSum(int a, int b){
        return a + b;
    }

    static int getSub(int a, int b){
        return a - b;
    }

    static int getProduct(int a, int b){
        return a * b;
    }

    static int getDiv(int a, int b){
        return a / b;
    }

}
