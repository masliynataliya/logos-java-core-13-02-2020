package homework.ihorpayensky.homeworks.homework21.min;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;


class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        People p = new People("name", 123);
        System.out.println(p.toString());

        File file = new File("src\\main\\java\\homework\\ihorpayensky\\homeworks\\homework21\\text.txt");
        something(p, file);


        ArrayList<String> deserPeople = (ArrayList<String>) getFile(file);
        System.out.println("Read people: " + deserPeople.toString());

        //  нагадаю задачу
        // ЗАПИСАТИ ПОЛЯ КЛАСУ ЯКІ ПРОМАРКОВАНІ АНОТАЦІЄЮ В ФАЙЛ
        // НЕ КЛАС

    }

    private static void something(People people, File file) throws IOException {
        Class<? extends People> aClass = people.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        ArrayList<String> arr = new ArrayList<>();

        for (Field e: declaredFields) {
            MyAnnotation annotation = e.getAnnotation(MyAnnotation.class);
            if (annotation != null && annotation.serializable()) {
                arr.add(e.getName());
            }
        }
        save(arr, file);
    }

    private static void save(Serializable object, File file) throws IOException {
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(object);
        os.close();
    }

    private static Serializable getFile(File file) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        return (Serializable) ois.readObject();
    }

}

