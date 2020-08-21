package lesson.example.java.core.lesson22;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceApp {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println(list);

        Predicate<Integer> isEven = (x) -> {return x % 2 == 0;};
        Predicate<Integer> predicate = (x) -> {return true;};

        evaluate(list, isEven);

        // обидва виклики функції ідентичні
        evaluate(list, predicate);
        evaluate(list, x -> true);

        //MethodReference
        list.forEach(x -> System.out.println(x));
        list.forEach(System.out::println);
    }

    private static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer i : list) {
            if (predicate.test(i)) {
                System.out.println("Test passed for " + i);
            }
        }
    }
}
