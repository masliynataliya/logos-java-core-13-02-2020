package homework.mikekhay.hwjavacore16;

import java.lang.reflect.*;

public class App {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Car car = new Car("Audi",2010);
        Class carClassa = car.getClass();
        System.out.println(carClassa);
        System.out.println(carClassa.getPackage());
        System.out.println(carClassa.getName());
        System.out.println(carClassa.getSimpleName());
        System.out.println(carClassa.getSuperclass());

        int modifiers = carClassa.getModifiers();
        System.out.println(Modifier.toString(modifiers));
        System.out.println(Modifier.isStatic(modifiers));
        System.out.println(Modifier.isPublic(modifiers));
        System.out.println(Modifier.isPrivate(modifiers));
        System.out.println(Modifier.isAbstract(modifiers));
        System.out.println();


        Constructor[] constructors = carClassa.getConstructors();
        for (int i = 0; i < constructors.length; i++){
            System.out.println(constructors[i]);
        }
        System.out.println();

        Constructor<Car> con = constructors[1];
        Car car1 = con.newInstance("BMW",2015);
        System.out.println(car1);

        Field[] fields = carClassa.getDeclaredFields();
        for (int i = 0; i < fields.length; i++){
            System.out.println(fields[i]);
        }

        fields[1].setAccessible(true);
        fields[1].set(car,2018);
        System.out.println(car);

        System.out.println();

        Method method = carClassa.getMethod("startTheCar");
        System.out.println(method);
        method.invoke(car);
        System.out.println();

        Method method1 = carClassa.getDeclaredMethod("muteTheCar");
        method1.setAccessible(true);
        method1.invoke(car);
    }
}
