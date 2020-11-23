package homework.ihorpayensky.homeworks.homework22.task5;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
        Frog frog = new Frog();

        Amphibia amphibia = new Frog();

        Class<? extends Amphibia> aClass = amphibia.getClass();
        List<Method> declaredMethods = Arrays.asList(aClass.getSuperclass().getDeclaredMethods());


        System.out.println("\n === Дубль 1 === ");
        for (Method m: declaredMethods) {
            try {
                System.out.println(m.invoke(amphibia));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }


        System.out.println("\n === Дубль 2 === ");
        Function<Method, String> surprise =
                x -> {
                    try {
                        return (String) x.invoke(amphibia);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    return null;
                };

        declaredMethods.forEach(x-> System.out.println(surprise.apply(x)));
    }
}
