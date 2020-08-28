package lesson.example.java.core.lesson23;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamApiApp {

    public static void main(String[] args) {

        // створення stream
        Stream<Integer> s1 = Stream.of(1,2,4,56,777);

        Integer[] intArray = new Integer[]{2,4,6,8,0};
        Stream<Integer> s2 = Stream.of(intArray);
        Stream<Integer> s3 = Arrays.stream(intArray);

        List<String> usCities = new ArrayList<>();
        usCities.add("Los Angeles");
        usCities.add("Louisiana");
        usCities.add("Orlando");
        usCities.add("Louisiana");
        usCities.add("New York");
        usCities.add(null);
        Stream<String> s4 = usCities.stream();

        Stream<Object> s5 = Stream.builder()
            .add("LA")
            .add("Washington")
            .add("Florida")
            .build();

        // filter + collect
        System.out.println("Unfiltered list - " + usCities);
        List<String> lCities = usCities.stream()
            .filter(Objects::nonNull)
            .filter(city -> city.startsWith("L"))
            .collect(toList());
        System.out.println("Filtered list - " + lCities);

        // count + distinct
        long lCitiesCount = usCities.stream()
            .filter(Objects::nonNull)
            .filter(city -> city.startsWith("L"))
            .distinct()
            .count();
        System.out.println(lCitiesCount);

        // skip + limit
        List<String> limitedList = usCities.stream()
            .skip(2) // скільки пропустити
            .limit(3) // скільки взяти наступних елементів
            .collect(toList());
        System.out.println(limitedList);
        System.out.println();

        // map
        List<String> names = List.of(new String[]{"Pavlo", "Marta", "Eduardo"});
        List<User> users = names.stream()
            .map(name -> new User(name))
            .collect(toList());

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Andrew", "123-456-78-90", "79000"));
        customers.add(new Customer("Paul", "098-765-43-21", "45000"));
        customers.add(new Customer("Anna", "109-827-63-45", "04000"));

        long kyivCustomersCount = customers.stream()
            .map(customer -> customer.getIndex())
            .filter(index -> index.equals("04000"))
            .count();

        //sorted
        System.out.println(customers);
        List<Customer> sortedList = customers.stream()
            .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
            .collect(toList());
        System.out.println(sortedList);

        sortedList.forEach(customer -> System.out.println(customer));

        // flatMap - приводить багатовибірну колекцію до одновимірної
        List<List<String>> listOfLists = List.of(List.of("one", "two", "three"), List.of("four", "five", "six")); // маємо двовимірну колекцію - ліст лістів
        List<String> flatMappedList = listOfLists.stream() // ми приводимо зовнішній ліст до стріма
            .flatMap(x -> x.stream()) // цією лямдою ми приводимо внутрішні лісти до стріма також -- такимчином ми сожемо об'єднати зовнішні та внутрішні лісти в один стрім -- і отримати на виході одновимірну колекцію
            .collect(toList());

        // findFirst, findAny
        String cityName = usCities.stream()
            .filter(Objects::nonNull)
            .filter(city -> city.startsWith("O"))
            .findFirst()
            .orElseThrow(RuntimeException::new);
        System.out.println("city name - " + cityName);

        // min, max
        String cityNameMin = usCities.stream()
            .filter(Objects::nonNull)
            .min((e1, e2) -> e1.compareTo(e2))
            .orElseThrow(RuntimeException::new);
        System.out.println("city name - " + cityNameMin);

        System.out.println();

        // peek
        Set<String> citySet = usCities.stream()
            .filter(Objects::nonNull)
            //.map(city -> city.toUpperCase())
            .peek(city -> System.out.println(city.toUpperCase()))
            .collect(toSet());

        System.out.println(citySet);

    }
}

class Customer {

    private String name;
    private String phoneNumber;
    private String index;

    public Customer(String name, String phoneNumber, String index) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
            "name='" + name + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", index='" + index + '\'' +
            '}';
    }
}
