package ExampleCode;

public class ErrorChecking {
    public static void main(String[] args) {
        System.out.println("Method Main run successfully.");
        method1();
        System.out.println("Method Main ends its work.");
    }

    static void method1() {
        try {
            System.out.println("First method says hi!");
            method2();
        } catch (ArithmeticException err) {
            System.out.println(err.getMessage());
        }
    }

    static void method2() {
        int x = 10;
        int y = 0;
        double z = x / y;
        System.out.println( z );
        System.out.println("Second method");
    }
}