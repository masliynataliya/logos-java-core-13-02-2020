package lesson.example.java.core.lesson19.iostreams;

import java.io.*;

public class StreamsApp {

    public static void main(String[] args) throws IOException {
        File file = new File("FileWriteUsingStream.txt");
        writeUsingStream(file, "Hello, Java people!");
        String s = readFromFileUsingStream(file);
        System.out.println(s);
    }

    public static void writeUsingStream(File file, String data) throws IOException {
        OutputStream os = new FileOutputStream(file);
        os.write(data.getBytes());
        os.close();
    }

    public static String readFromFileUsingStream(File file) throws IOException {
        InputStream is = new FileInputStream(file);
        int information = is.read();
        StringBuilder sb = new StringBuilder();

        while (information != -1) {
            char c = (char) information;
            sb.append(c);
            information = is.read();
        }

        is.close();
        return sb.toString();
    }
}
