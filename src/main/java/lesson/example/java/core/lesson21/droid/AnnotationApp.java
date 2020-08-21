package lesson.example.java.core.lesson21.droid;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class AnnotationApp {

    public static void main(String[] args) throws IllegalAccessException {

        Droid droid = new Droid();
        droid.setName("Pavlo");
        System.out.println(droid.getName());

        Class cl = droid.getClass();
        Field[] declaredFields = cl.getDeclaredFields();
        for (Field field : declaredFields) {

            Annotation[] annotations = field.getAnnotations();
            List<Annotation> annotationList = Arrays.asList(annotations);
            System.out.println(field.getName() + " " + annotationList);

            for (Annotation annotation : annotationList) {
                if (annotation instanceof Fielder) {
                    System.out.println("yeeey! " + ((Fielder) annotation).value());
                    field.setAccessible(true);
                    field.set(droid, "Fielder");
                }
            }
        }
        System.out.println(droid.getName());
    }
}
