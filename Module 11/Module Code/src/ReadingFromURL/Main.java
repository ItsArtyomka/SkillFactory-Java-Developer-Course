package ReadingFromURL;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

@SuppressWarnings("ReassignedVariable")
public class Main {
    public static void main(String[] args) {
        // Variables
        String urlPath = "https://randomuser.me/api"; // This url generates random data.
        URL url = null;

        // Using the URL class to read from url.
        try {
            url = new URL(urlPath);
        } catch (MalformedURLException e) {
            System.out.println("Incorrect URL. " + e.getMessage());
        }

        // if to avoid NullPointerException.
        if (url != null) {
            // Using try-with-resources to simplify the code aka no need to close streams.
            try(InputStream inputStream = url.openStream(); FileOutputStream fileOutputStream = new FileOutputStream("people.json")){
                // foreach loop for outputting characters.
                for (byte b: inputStream.readAllBytes()) {
                    fileOutputStream.write(b);
                }
            } catch (IOException e) { // Catching IO exceptions.
                System.out.println("IO Problem. " + e.getMessage());
            }
            System.out.println("Data has been transferred."); // Confirmation of success.
        }
    }
}
