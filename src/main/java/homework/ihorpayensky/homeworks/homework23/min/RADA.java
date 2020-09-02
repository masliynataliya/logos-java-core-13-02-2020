package homework.ihorpayensky.homeworks.homework23.min;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class RADA{

    private List<Fraction> fractionList;
    private static RADA rada;

    private RADA() {
        this.fractionList = new ArrayList<>();
    }
    public static RADA getInstance() {
        if (rada == null)
            rada = new RADA();
        return rada;
    }

    private void checkFractionListIsEmpty() {
        if (fractionList.isEmpty()) {
            System.out.println("Список фракцій пустий\n");
            return;
        }
    }

    // 1
    public void addFraction(Scanner scanner) {
        System.out.print("Введіть назву фракції >> ");
        String name = scanner.next();

        boolean nameIsExist = fractionList.stream()
                .anyMatch(x -> x.getFractionName().equalsIgnoreCase(name));

        if (nameIsExist) {
            System.out.println("Така фракція вже існує\n");
            return;
        }

        fractionList.add(new Fraction(name));
        System.out.println("Створено нову фракцію\n");
    }

    // 2
    public void removeFraction(Scanner scanner) {
        checkFractionListIsEmpty();

        System.out.println("Id\t| Фракція");
        fractionList.forEach(x -> System.out.println(x.getId() + "\t| " + x.getFractionName()));

        System.out.print("Введіть id фракції >> ");
        int fractionId = scanner.nextInt();

        boolean present = fractionList.stream()
                .anyMatch(x -> x.getId() == fractionId);

        if (present) {
            System.out.println("Фракцію '" + fractionList.get(fractionId).getFractionName() + "' успішно видалено\n");
            fractionList.remove(fractionId);
            return;
        }
        System.out.println("Фракції з таким Id не існує\n");
    }

    // 3
    public void getAllFractions() {
        checkFractionListIsEmpty();

        System.out.println("Id\t| Фракція / депутати");
        fractionList.forEach(x -> System.out.println(x.getId() + "\t| " + x.toString()));
        System.out.println();
    }

    //4
    public void clearFractionFromDeputy(Scanner scanner) {
        checkFractionListIsEmpty();

        System.out.println("Id\t| Фракція / депутати");
        fractionList.forEach(x -> System.out.println(x.getId() + "\t| " + x.toString()));

        System.out.print("Введіть id фракції >> ");
        int fractionId = scanner.nextInt();

        boolean present = fractionList.stream()
                .anyMatch(x -> x.getId() == fractionId);

        if (present) {
            System.out.println("Фракцію '" + fractionList.get(fractionId).getFractionName() + "' успішно очищено\n");
            fractionList.get(fractionId).clearDeputyList();
            return;
        }
        System.out.println("Фракції з таким Id не існує\n");
    }

    // 5
    public void showFraction(Scanner scanner) {
        checkFractionListIsEmpty();

        System.out.println("Id\t| Фракція");
        fractionList.forEach(x -> System.out.println(x.getId() + "\t| " + x.getFractionName()));

        System.out.print("Введіть id фракції >> ");
        int fractionId = scanner.nextInt();

        boolean present = fractionList.stream()
                .anyMatch(x -> x.getId() == fractionId);

        if (present) {
            System.out.println("Фракція '" + fractionList.get(fractionId).toString() + "'");
            fractionList.remove(fractionId);
            System.out.println();
            return;
        }
        System.out.println("Фракції з таким Id не існує\n");
    }

    // 6
    public void addDeputyToFraction(Scanner scanner) {
        checkFractionListIsEmpty();

        System.out.println("Id\t| Фракція");
        fractionList.forEach(x -> System.out.println(x.getId() + "\t| " + x.getFractionName()));

        System.out.print("Введіть id фракції >> ");
        int fractionId = scanner.nextInt();

        boolean present = fractionList.stream()
                .anyMatch(x -> x.getId() == fractionId);

        if (present) {
            Fraction fraction = fractionList.get(fractionId);

            System.out.print("Введіть ім'я >> ");
            String firstName = scanner.next();

            System.out.print("Введіть Прізвище >> ");
            String lastName = scanner.next();

            boolean ifExist = fractionList.stream()
                    .anyMatch(x ->
                            x.getDeputyList().stream()
                                    .anyMatch(a ->
                                            a.getFirstName().equalsIgnoreCase(firstName)
                                                    && a.getLastName().equalsIgnoreCase(lastName)));

            if (ifExist) {
                System.out.println("Цей дипутат вже є у якійсь із існуючих фракцій\n");
                return;
            }

            System.out.print("Введіть вік >> ");
            int age = scanner.nextInt();

            System.out.print("Введіть вагу >> ");
            int weight = scanner.nextInt();

            System.out.print("Введіть ріст >> ");
            int height = scanner.nextInt();

            System.out.println("1 - true, 2 - false");
            System.out.print("Хабарник? >> ");
            int briber = scanner.nextInt();

            fraction.addDeputy(new Deputy(firstName, lastName, age, weight, height, briber==1));
            System.out.println("До фракції " + fraction.getFractionName() + " додано нового дипутата\n");
            return;
        }
        System.out.println("Фракції з таким Id не існує\n");
    }

    // 7
    public void removeDeputy(Scanner scanner) {
        checkFractionListIsEmpty();

        System.out.println("Id\t| Фракція / депутати");
        fractionList.forEach(x -> System.out.println(x.getId() + "\t| " + x.toString()));

        System.out.print("Введіть id фракції >> ");
        int fractionId = scanner.nextInt();

        boolean present = fractionList.stream()
                .anyMatch(x -> x.getId() == fractionId);

        if (present) {
            List<Deputy> deputyList = fractionList.get(fractionId).getDeputyList();
            System.out.println("Id\t| Deputy");
            deputyList.forEach(x -> System.out.println(x.getId() + "\t| " + x.toString()));

            System.out.print("Введіть id дипутата >> ");
            int deputyId = scanner.nextInt();

            boolean deputyIsExist = deputyList.stream().anyMatch(x -> x.getId() == deputyId);
            if (deputyIsExist) {
                System.out.println("Дипутата успішно вигнано");
                deputyList.remove(deputyId);
                return;
            }
            System.out.println("Дипутата із таким id не знайдено");
            return;
        }
        System.out.println("Фракції з таким Id не існує\n");
    }

    // 8
    public void showBribers() {
        checkFractionListIsEmpty();

        fractionList.forEach(x -> System.out.println(
                x.getDeputyList().stream()
                        .filter(Deputy::isBriber)
                        .collect(Collectors.toList())
                        .toString()));
        System.out.println();
    }

    // 9
    public void getBestBriber() {
        checkFractionListIsEmpty();
        fractionList.stream()
                .peek(x -> x.getDeputyList().stream()
                        .sorted(Deputy::compareTo))
                .findFirst()
                .ifPresent(a -> System.out.println(a.toString()));
        System.out.println();
    }

}
