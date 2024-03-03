package Exercise10_2_1;

import java.util.Scanner;

public class Main1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(new OneZeroStream());
        for (int i = 0; i < 10; i++){
            System.out.print(scanner.nextInt());
        }

        /*
        The code above has to output
        1010101010
        */
    }
}
