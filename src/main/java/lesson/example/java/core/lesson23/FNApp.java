package lesson.example.java.core.lesson23;

import java.util.Scanner;
import java.util.function.*;

public class FNApp {

    public static void main(String[] args) {

        System.out.println("Predicate");
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-7));
        System.out.println(isPositive.test(0));
        System.out.println();

        System.out.println("BinaryOperator");
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(4,5));
        System.out.println();

        System.out.println("UnaryOperator");
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(67));
        System.out.println();

        System.out.println("Function");
        Function<Integer, String> converter = intMoney -> "My desire salary " + intMoney + "$";
        System.out.println(converter.apply(4500));
        System.out.println();

        System.out.println("Supplier");
        Supplier<User> userFactory = () -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name");
            String name = sc.next();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();
        User user3 = userFactory.get();

        System.out.println(user1.getName());
        System.out.println(user2.getName());
        System.out.println(user3.getName());
        System.out.println();
    }
}

class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
