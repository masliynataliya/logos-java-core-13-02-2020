package lesson.example.java.core.lesson16;

import java.lang.reflect.*;
import lesson.example.java.core.lesson15.StudentUKU;

public class ReflectApp {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class sc = StudentUKU.class;
        System.out.println(sc);

        System.out.println(sc.getName());
        System.out.println(sc.getSimpleName());

        int modifiers = sc.getModifiers();
        System.out.println(modifiers);
        System.out.println(Modifier.toString(modifiers));

        System.out.println(Modifier.isPublic(modifiers));
        System.out.println(Modifier.isStatic(modifiers));
        System.out.println(Modifier.isAbstract(modifiers));

        System.out.println();

        System.out.println(sc.getPackage());
        System.out.println(sc.getSuperclass());

        System.out.println();

        Constructor[] constructors = sc.getConstructors();
        for (int i = 0; i < constructors.length; i++) {
            System.out.println(constructors[i]);
        }
        System.out.println();

        Constructor<StudentUKU> con = sc.getConstructor(String.class);
        System.out.println(con);
        StudentUKU studentUKU;
        try {
            studentUKU = con.newInstance("Marta");
            System.out.println(studentUKU);
        } catch (InstantiationException e) {
            e.printStackTrace();
            return;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return;
        }

        System.out.println();

        Field[] fields = sc.getFields();
        System.out.println(fields[0].getName());

        System.out.println();

        Field[] declaredFields = sc.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            System.out.println(declaredFields[i]);
        }


            declaredFields[3].setAccessible(true);
            declaredFields[3].set(studentUKU, 14);
            System.out.println(studentUKU);


        System.out.println();

        Method[] methods = sc.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }

        System.out.println();
        Method method = sc.getMethod("printHello");
        System.out.println(method);
        method.invoke(studentUKU);

        studentUKU.printHello();

        System.out.println();

        System.out.println(con.newInstance("Taras"));
        System.out.println(sc.newInstance());
    }
}
