package homework.mikekhay.hwjavacore19;

import java.io.*;

public class Methods {
    public static void serialize(File file, Employee employee) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static void deserealize(File file) throws IOException, ClassNotFoundException {
        Employee employee = new Employee();
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        employee = (Employee) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        System.out.println(employee);
    }
}
