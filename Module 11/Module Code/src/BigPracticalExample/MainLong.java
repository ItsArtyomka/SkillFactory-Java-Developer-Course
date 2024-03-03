package BigPracticalExample;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

@SuppressWarnings({"CharsetObjectCanBeUsed", "ReassignedVariable", "ReturnInsideFinallyBlock"})
public class MainLong {
    public static void main(String[] args) {
        /* Checking if true based on 4 things */
        if (copyFileUsingStream(
                new File("src/BigPracticalExample/utf8.txt"),
                Charset.forName("UTF-8"),
                new File("src/BigPracticalExample/win1251.txt"),
                Charset.forName("WINDOWS-1251"))) {
            System.out.println("Redecoding is successful."); // Output if all conditions are met.
        }

    }

    /* Boolean to make it easier to find where condition is not met. */
    private static boolean copyFileUsingStream(File source, Charset sourceEnc, File dest, Charset destEnc) {
        /* Catching for exceptions in encoders. */
        Charset sEnc;
        try {
            sEnc = Charset.forName(String.valueOf(sourceEnc));
        } catch (UnsupportedCharsetException e) {
            System.out.println("Problem with Decoding of Input File.");
            return false;
        }

        Charset dEnc;
        try {
            dEnc = Charset.forName(String.valueOf(destEnc));
        } catch (UnsupportedCharsetException e) {
            System.out.println("Problem with Decoding of Output File.");
            return false;
        }

        /* Catching for exceptions in files */
        Reader fis;
        try {
            fis = new InputStreamReader(new FileInputStream(source), sEnc);
        } catch (FileNotFoundException e) {
            System.out.println("Problem with Input File.");
            return false;
        }

        Writer fos;
        try {
            fos = new OutputStreamWriter(new FileOutputStream(dest), dEnc);
        } catch (FileNotFoundException e) {
            System.out.println("Problem with Output File.");
            return false;
        }

        char[] buffer = new char[1024];
        int length;
        /* Catching exceptions during output. */
        try {
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (IOException e) {
            System.out.println("Problem with Copying.");
            return false;
        } finally { /* Finally closing the files and of course catching IOException */
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                System.out.println("Problem with Closing the Files.");
                return false;
            }
        }
        return true; /* Returns true if all conditions are met. */
    }
}