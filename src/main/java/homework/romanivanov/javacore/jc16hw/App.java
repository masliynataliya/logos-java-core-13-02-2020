package homework.romanivanov.javacore.jc16hw;
import homework.romanivanov.javacore.jc16hw.CatExample;

import java.lang.reflect.*;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {


        CatExample cat1 = new CatExample(8, "Dusya");
        Class catClass = cat1.getClass();
        System.out.println(catClass);

        Class anotherCatClass = Class.forName("homework.romanivanov.javacore.jc16hw.CatExample");
        System.out.println(anotherCatClass);

        System.out.println(catClass.getName());
        System.out.println(catClass.getSuperclass());
        System.out.println(catClass.getSimpleName());
        int modifiers = catClass.getModifiers();
        System.out.println(modifiers);
        System.out.println(Modifier.toString(1));
        System.out.println(Modifier.isProtected(modifiers));
        System.out.println(Modifier.isFinal(modifiers));

        Constructor[] constructors = catClass.getConstructors();
        for( int i = 0; i< constructors.length; i++){
            System.out.println(constructors[i]);
        }
        Constructor<CatExample> con = constructors[1];
        System.out.println(con);
        CatExample catExample = con.newInstance(12, "Manya");
        System.out.println(catExample);
//        Field[] fields = catClass.getFields();
//        System.out.println(fields[0].getName());

        Field[] declaredField = catClass.getDeclaredFields();
        for( int i = 0; i< declaredField.length; i++){
            System.out.println(declaredField[i]);
        }
        declaredField[0].setAccessible(true);   // 2 Завдання
        declaredField[0].set(cat1,20);
        System.out.println(cat1);


        System.out.println("");


        Method[] method = catClass.getDeclaredMethods();
        for( int i = 0; i< method.length; i++){
            System.out.println(method[i]);
//            method[i].invoke(cat1); погана практика
        }
        Method method1 = catClass.getMethod("meow"); ///3 Завдання
        System.out.println("");
        System.out.println(method1);
        method1.invoke(cat1);

        Method method2 = catClass.getDeclaredMethod("eat");
        method2.setAccessible(true);
        method2.invoke(cat1);






    }
}
