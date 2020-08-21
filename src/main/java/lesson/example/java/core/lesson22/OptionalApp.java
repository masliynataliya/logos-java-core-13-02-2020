package lesson.example.java.core.lesson22;

import java.util.Optional;

public class OptionalApp {

    public static void main(String[] args) {

        Optional<String> name = Optional.empty();

        System.out.println(name.isEmpty());
        System.out.println(name.isPresent());

        String ln = "Marta";
        Optional<String> lastName = Optional.of("Marta");

        System.out.println(ln.toUpperCase());
        lastName.ifPresent(x -> System.out.println(x));

        String nullString = null;
        Optional<String> stringOptional = Optional.ofNullable(nullString);
        stringOptional.ifPresent(x -> System.out.println("I'm not null"));

        //stringOptional.ofNullable(nullString).orElseThrow(RuntimeException::new);

        Integer year = 2020;
        Optional<Integer> optionalInteger = Optional.of(year);
        System.out.println(optionalInteger.filter(y -> y == 2020).isPresent());
    }
}
