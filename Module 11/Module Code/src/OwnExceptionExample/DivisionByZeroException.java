package OwnExceptionExample;

// Making my own exception class
public class DivisionByZeroException extends ArithmeticException {
    public DivisionByZeroException(String s) {
        super(s);
    }
}
