package Exercise11_2_1;

// Have to create code that create 8 different Runtime exceptions. OMG Shocking, I know :)
@SuppressWarnings({"ImplicitArrayToString", "StringOperationCanBeSimplified", "divzero"}) // <- To make the code look nice
public class CausingProblems { // ;)
    public static void main(String[] args) {

        /* Arithmetic exception */
        int a = 1;
        int b = 0;
        int sum = a / b;
        System.out.println(sum); // java.lang.ArithmeticException: / by zero

        /* ArrayIndexOutOfBoundsException */
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBounds: 3

        /* ArrayStoreException */
        Number[] numArr = new Double[2];
        numArr[0] = 4;
        System.out.println(numArr[0]); // java.lang.ArrayStoreException: java.lang.Integer

        /* ClassCastException */
        Object msg = new String("Hi");
        System.out.println((int) msg); // java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer

        /* NegativeArraySizeException */
        int[] intArr = new int[-1];
        System.out.println(intArr); // java.lang.NegativeArraySizeException

        /* NullPointerException */
        String nullStr = null;
        System.out.println(nullStr.length()); // java.lang.NullPointerException

        /* NumberFormatException */
        String string = "Hello";
        System.out.println(Integer.parseInt(string)); // java.lang.NumberFormatException: For input string: "Hello"

        /* StringIndexOutOfBoundsException */
        String noString = "";
        System.out.println(noString.substring(1)); // java.lang.StringIndexOutOfBoundsException: String index out of range: -1
    }
}
