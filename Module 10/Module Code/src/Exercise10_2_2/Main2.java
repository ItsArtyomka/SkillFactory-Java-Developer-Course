package Exercise10_2_2;

import java.io.*;

public class Main2 {


    public static void main(String[] args) throws IOException {
        /*
        The SECOND LINE of output is the Answer for the exercise.
        */

        String fileName = "C:\\Users\\Artyom\\Desktop\\Java\\SkillFactory Course\\Module 10\\Module Code\\src\\answer.txt";
        FileInputStream fis = new FileInputStream(fileName);

        int i;
        while((i = fis.read()) != -1) {
            System.out.print((char)i);
        }

        fis.close();
        System.out.println();
    }

    /*
    The Output:
    THIS IS NOT A CODE
    MERRY XMAS AND HAPPY NEW YEAR!
    THIS IS NOT A CODE EITHER
     */
}
