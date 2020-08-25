package lesson.example.java.core.lesson21.student;

import java.lang.reflect.Field;

public class GreetingsApp {

    public static void main(String[] args) throws IllegalAccessException {

        Student anna = new Student("Anna", 23, 56);
        Student perto = new Student("Petro", 24, 90);

        sayHi(anna);



    }

    private static void sayHi(Student student) throws IllegalAccessException {
        Class<? extends Student> cl = student.getClass();
        Field[] declaredFields = cl.getDeclaredFields();
        StringBuilder sb = new StringBuilder();

        for (Field field: declaredFields) {
            Social annotation = field.getAnnotation(Social.class);
            if (annotation != null) {
                String value = annotation.value();
                sb.append(value);
                field.setAccessible(true);
                sb.append(field.get(student));
                sb.append(". ");
            }
        }
        System.out.println(sb.toString());

    }
}
