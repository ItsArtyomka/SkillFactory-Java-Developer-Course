package Exercise10_2_3;

import java.io.*;

// The code outputs the total number of symbols-integers in "asciitable.txt" file.
public class Main3 {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Artyom\\Desktop\\Java\\SkillFactory Course\\Module 10\\Module Code\\src\\asciitable.txt";
        FileInputStream fis = new FileInputStream(fileName);

        int c;
        int s = 0;

        while ((c = fis.read()) != -1) {
            if (c >='0' && c <= '9') {
                s++;
            }
        }

        System.out.println(s);
        fis.close();

        /*
         * The Output:
         * 1750
         */
    }
}
