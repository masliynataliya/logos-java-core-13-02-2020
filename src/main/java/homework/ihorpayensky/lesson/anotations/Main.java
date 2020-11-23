package homework.ihorpayensky.lesson.anotations;

import java.lang.reflect.Field;
import java.text.Annotation;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Class cl = new Droid().getClass();

        Field[] declaredFields = cl.getDeclaredFields();

        for (Field field: declaredFields) {
            Annotation[] annotations = (Annotation[]) field.getAnnotations();
            System.out.println(field.getName() + " " + Arrays.asList(annotations));
        }


    }
}
