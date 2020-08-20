package lesson.example.java.core.lesson19.iostreams;

import java.io.*;

public class SymbolStreamsApp {

    public static void main(String[] args) throws IOException {

        File file = new File("FileForSymbolStream.txt");
        writeSymbolStream(file, "New day, new Java");
        String s = readSymbolStream(file, 17);
        System.out.println(s);

    }

    public static void writeSymbolStream(File file, String data) throws IOException {
        Writer writer = new FileWriter(file);
        writer.write(data);
        writer.close();
    }

    public static String readSymbolStream(File file, int arraySize) throws IOException {
        Reader reader = new FileReader(file);
        char[] array = new char[arraySize];
        StringBuilder sb = new StringBuilder();

        reader.read(array);
        reader.close();

        for (char c: array) {
            sb.append(c);
        }

        return sb.toString();
    }
}
