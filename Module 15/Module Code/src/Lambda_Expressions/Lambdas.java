package Lambda_Expressions;

public class Lambdas {
    public static void main(String[] args) throws InterruptedException {
        int value = 70;
        validate(value, newValue -> newValue >= 60);
    }

    private static void validate(int value, Validator validator) throws InterruptedException {
        System.out.println("Checking the value according to validator...");
        Thread.sleep(1500);
        boolean isValid = validator.validate(value);
        if (isValid) {
            System.out.println("Value is correct!");
        } else {
            System.out.println("Value is incorrect!");
        }
    }
}
