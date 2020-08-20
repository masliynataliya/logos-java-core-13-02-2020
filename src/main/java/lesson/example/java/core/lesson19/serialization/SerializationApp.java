package lesson.example.java.core.lesson19.serialization;

import java.io.*;

public class SerializationApp {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Petro", "Vyhvat", 34, new Dog("Kamila"));
        System.out.println(person);
        File file = new File("NewPERSONalFile.txt");
        writeObject(person, file);
        Person newPerson = (Person) readObject(file);
        System.out.println(newPerson);

        System.out.println();

        System.out.println(newPerson.getDog().toString());
    }

    public static void writeObject(Serializable object, File file) throws IOException {
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(object);
        oos.close();
    }

    public static Serializable readObject(File file) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        return (Serializable) ois.readObject();
    }
}
