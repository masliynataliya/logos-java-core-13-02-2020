package homework.romanivanov.javacore.jc19hw;
import java.io.*;

public class Methods {
    public static void serialize(File file, Employee employee) throws IOException {
        FileOutputStream file1 = new FileOutputStream(file);
        ObjectOutputStream outputStream = new ObjectOutputStream(file1);
        outputStream.writeObject(employee);
        outputStream.close();
        file1.close();
        System.out.println("Об'єкт серіалізований");


    }
    public static void deserialize(File file) throws IOException, ClassNotFoundException {
        Employee employee = new Employee();
        FileInputStream file1 = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(file1);
        employee = (Employee)in.readObject();
        in.close();
        file1.close();
        System.out.println("Об'єкт десеріалізований");
        System.out.println(employee);




    }
}
