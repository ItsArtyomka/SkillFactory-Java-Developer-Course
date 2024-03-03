package OwnExceptionExample;

// Class example that implements own exception class that I made.
@SuppressWarnings("ConstantValue")
public class UnCheckedException {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 0;

        try {
            if (number2 == 0)
                throw new DivisionByZeroException("Cannot divide by 0.");
            System.out.println(number1 / number2);
        } catch (DivisionByZeroException err){
            /* err is outputting the error msg via different stream */
            System.err.println("Error occurred. " + err.getMessage());
        } finally {
            System.out.println("Program finished running.");
        }
    }
}
