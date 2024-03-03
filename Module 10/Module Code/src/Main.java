import java.io.*;

public class Main {
    private static void copyFileUsingStream(String source, String dest) throws IOException {

        InputStream fis = new FileInputStream(source);
        OutputStream fos = new FileOutputStream(dest);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }
        fis.close();
        fos.close();
    }

    public static void main(String[] args) throws IOException {
        String source = "C:\\Users\\Artyom\\Desktop\\Java\\SkillFactory Course\\Module 10\\Module Code\\src\\source1.txt";
        String destination = "C:\\Users\\Artyom\\Desktop\\Java\\SkillFactory Course\\Module 10\\Module Code\\src\\dest1.txt";
        copyFileUsingStream(source,destination);
    }
}

