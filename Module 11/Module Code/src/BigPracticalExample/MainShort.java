package BigPracticalExample;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* Own Exception Converter*/
class ConvertException extends Exception {
    ConvertException(String message) {
        super(message);
    }
}

@SuppressWarnings({"ReassignedVariable", "CharsetObjectCanBeUsed"})
public class MainShort {
    public static void main(String[] args) {
        /* Checking if true based on 4 things */
        try {
            copyFileUsingStream(
                    new File("src/BigPracticalExample/utf8.txt"),
                    Charset.forName("UTF-8"),
                    new File("src/BigPracticalExample/win1251.txt"),
                    Charset.forName("WINDOWS-1251"));
            System.out.println("Redecoding is successful."); // Output if all conditions are met.
        } catch (ConvertException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /* try-with-resources structure */
    /* Boolean to make it easier to find where condition is not met. */
    private static void copyFileUsingStream(File source, Charset sourceEnc, File desc, Charset destEnc) throws ConvertException { // throws ConvertException is needed for re-throwing.
        try (Reader fis = new InputStreamReader(new FileInputStream(source), Charset.forName(String.valueOf(sourceEnc)));
             Writer fos = new OutputStreamWriter(new FileOutputStream(desc), Charset.forName(String.valueOf(destEnc)))) {

            char[] buffer = new char[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (UnsupportedCharsetException ex) {
            throw new ConvertException("Problem with Decoding. " + ex.getMessage()); // Here getMessage() helps to find with Charset is unsupported.
        } catch (FileNotFoundException ex) {
            throw new ConvertException("Problem with Files. " + ex.getMessage()); // Here getMessage helps to figure out which file causes a problem.
        } catch (IOException ex) {
            throw new ConvertException("Problem with Copying.");
        }
    }
}
