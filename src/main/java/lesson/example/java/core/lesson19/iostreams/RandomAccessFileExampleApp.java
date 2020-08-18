package lesson.example.java.core.lesson19.iostreams;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExampleApp {

    public static void main(String[] args) throws IOException {
        File file = new File("RandomAccessFileFileFile.txt");
        writeToFile(file, "Hi world", 15);
        String s = readFromFile(file, 15, 10);
        System.out.println(s);
    }

    public static void writeToFile(File file, String data, int position) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        raf.seek(position);
        raf.write(data.getBytes());
        raf.close();
    }

    public static String readFromFile(File file, int position, int size) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        byte[] array = new byte[size];
        raf.seek(position);
        raf.read(array);

        StringBuilder sb = new StringBuilder();
        for (byte b : array) {
            sb.append((char) b);
        }
        return sb.toString();

    }


}
