package lesson.example.java.core.lesson19.iostreams;

import java.io.IOException;
import java.io.InputStream;

public class Echo {

    public static void main(String[] args) {
        echo(System.in);
    }

    public static void echo(InputStream in) {
        try {
            while (true) {
                int i = in.read();
                if (i == -1) break;
                char c = (char) i;
                System.out.println(c);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println();
    }
}
