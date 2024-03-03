package ExceptionExamples;

public class ExceptionExample3 {
    public static void doAction() {
        try {
            int a = (int) (Math.random() * 2);
            System.out.println("a = " + a);
            int[] c = {1 / a}; // Danger #1
            c[a] = 71; // Danger #2
        } catch (ArithmeticException e) {
            System.err.println("Division by 0" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Out Of Bound: " + e);
        } // End of try-catch
        System.out.println("After try-catch");
    }

    public static void main(String[] args) {
        doAction();
    }
}
