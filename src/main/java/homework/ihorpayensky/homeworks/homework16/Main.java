package homework.ihorpayensky.homeworks.homework16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        System.out.println("\n === Task min 1 === ");
        Pet pet = new Pet("Scooby", "dog", 8, 20.2);
        System.out.println("\n" + pet.toString());

        Class aClass = pet.getClass();

        System.out.println("\n === Get constructors === ");
        Constructor[] constructors = aClass.getConstructors();
        System.out.println("Constructors count: " + constructors.length);
        int i = 1;
        for (Constructor c: constructors) {
            System.out.println(i + "\t| " + c.toString());
            i++;
        }

        System.out.println("\n === Get declared fields === ");
        Field[] declaredFields = aClass.getDeclaredFields();
        System.out.println("Declared fields count: " + declaredFields.length);
        i = 1;
        for (Field f:declaredFields) {
            System.out.println(i + "\t| " + f.getName() + "\t| " + f.toString());
            i++;
        }

        System.out.println("\n === Get methods === ");
        Method[] declaredMethods = aClass.getDeclaredMethods();
        System.out.println("Methods count: " + declaredMethods.length);
        i=1;
        for (Method m: declaredMethods) {
            System.out.println(i + "\t| " + m.getName() + "\t| Parameters count: " + m.getParameterCount());
            i++;
        }

        System.out.println("\n === Task max 2 === ");

        System.out.println("Before changing:\t" + pet.toString());
        declaredFields[0].setAccessible(true);
        declaredFields[0].set(pet, "Beethoven");
        declaredFields[2].setAccessible(true);
        declaredFields[2].set(pet, 111);
        System.out.println("After changing:\t" + pet.toString());
        System.out.println();


        System.out.println("\n === Task max 3 === ");

        Method m1 = aClass.getMethod("myMethod", String.class, int.class);
        System.out.println("Invoking first method");
        m1.invoke(pet, "Shaggy", 3);
        System.out.println();

        Method m2 = aClass.getMethod("myMethod", String[].class);
        System.out.println("Invoking second method");
        m2.invoke(pet, (Object) new String[]{"Hello", "world", "my", "name", "is", "error"});

    }
}
