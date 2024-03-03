public class Main {


    public static void main(String[] args) {

        // Adding new line to the lines array.
        CoolPrinter.add("Own, two,");
        CoolPrinter.add("I love you.");
        CoolPrinter.add("Three, four,");
        CoolPrinter.add("Touch the floor.");

        // Printing out the lines via anonymous formatter.
        // The anonymous class implements the Formatter interface and overrides its format() method to return a formatted version of the input line.
        // This anonymous class instance is then passed as an argument to the print(Formatter formatter) method.
        CoolPrinter.print(new Formatter() {
            @Override
            public String format(String line) {
                return "** " + line + " **";
            }
        });

        /*
        Output:
        ** Own, two, **
        ** I love you. **
        ** Three, four, **
        ** Touch the floor. **
        */
    }

}
