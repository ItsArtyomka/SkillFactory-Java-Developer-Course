package ExceptionExamples;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExceptionExample1 {
    public static void main(String[] args) {
        try {
            NumberFormat nf = NumberFormat.getInstance();
            //Deliberately creating an error.
            System.out.println(nf.parse("NOT A NUMBER"));
        }
        catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End of Program!");
    }
}
