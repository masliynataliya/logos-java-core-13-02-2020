package homework.romanivanov.javacore.jc21hw;

import java.io.*;
import java.lang.reflect.Field;

public class App {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        File file = new File("NewFileName.txt");
        Person person = new Person("Roma", "Sekh", "Akakiy");
//        annotationInterceptor(person.getClass(), file);
        annotationInterceptor(person,file);


    }

    private static void print(File file, String fieldName) throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        ObjectOutputStream ous = new ObjectOutputStream(fileOutputStream);
//        ous.writeObject(fieldName);
//        System.out.println(fieldName);
//        ous.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        writer.append(' ');
        writer.append(fieldName);
        writer.close();
    }

    private static Person annotationInterceptor(Person person, File file) throws IOException, IllegalAccessException {
        Field[] declaredFields = person.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if (declaredField.isAnnotationPresent(AnnotationExample.class)) {
                print(file, declaredField.getName());
                declaredField.setAccessible(true);
                String value = declaredField.getAnnotation(AnnotationExample.class).value();
                declaredField.set(person, value);
            }

        }
        System.out.println(person.toString());
        return person;
    }

}
