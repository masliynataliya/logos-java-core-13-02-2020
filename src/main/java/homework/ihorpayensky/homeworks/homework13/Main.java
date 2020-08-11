package homework.ihorpayensky.homeworks.homework13;

import java.util.Scanner;

/*

        всі фракції записуються великими буквами автоматично
        при пошуку бажаної фракції або ж імені дипутата можна використовувати
        символи будь-якого регістру


        що добавлено:
        + фракції мають імена
        + сортування списків депутатів та фракцій
        + валідація імен

        знайдете ще щось що я добавив але не записав, ви знаєте куди писати)

         */

class Main {
    public static void main(String[] args) {
        RADA rada = new RADA();
        while(true) {
            System.out.println("\nВас вітає верховна рада");
            System.out.println("Введіть ... щоб отримати: ");
            System.out.println("1 - Додати фракцію");
            System.out.println("2 - Видалити конкретну фракцію");
            System.out.println("3 - Вивести усі фракції");
            System.out.println("4 - Очистити конкретну фракцію");
            System.out.println("5 - Вивести дані про конкретну фракцію");
            System.out.println("6 - Додати дипутата у фракцію");
            System.out.println("7 - Видалити дипутата з фракції");
            System.out.println("8 - Вивести список хабарників");
            System.out.println("9 - Вивести найбільшого хабарника");
            System.out.println("0 - Депутат");
            System.out.println();
            System.out.print(" >> ");
            String mainScaner = new Scanner(System.in).nextLine();

            switch (mainScaner) {
                case "1":
                    System.out.println("Додати нову фракцію");
                    System.out.print("Введіть назву фракції >> ");
                    String newFractionName = new Scanner(System.in).nextLine().toUpperCase();
                    if (newFractionName.length() < 4)
                        System.out.println("Не допустимий розмір імені для фракіції \n(мінімум 4 сисмволи)");
                    else
                        rada.addFraction(newFractionName);
                    break;
                case "2":
                    System.out.println("Видалити конкретну фракцію");
                    System.out.print("Введіть назву фракції >> ");
                    String fractionName2 = new Scanner(System.in).nextLine();
                    rada.removeFraction(fractionName2);
                    break;
                case "3":
                    System.out.println("Усі фракції");
                    rada.getAllFractions();
                    break;
                case "4":
                    System.out.println("Очистити фракцію");
                    System.out.print("Введіть назву фракції >> ");
                    String fractionName4 = new Scanner(System.in).nextLine();
                    rada.clearFraction(fractionName4);
                    break;
                case "5":
                    System.out.println("Вивести дані про конкретну фракцію");
                    System.out.print("Введіть назву фракції >> ");
                    String fractionName5 = new Scanner(System.in).nextLine();
                    rada.getFractionInfo(fractionName5);
                    break;
                case "6":
                    System.out.println("Додати депутата до фракції");
                    System.out.print("Введіть назву фракції >> ");
                    String fractionName6 = new Scanner(System.in).nextLine();
                    if (rada.checkFraction(fractionName6)) {
                        System.out.println("Введіть дані депутата");
                        System.out.println("(Ім'я та прізвище повинно містити не менше 4 символа)");

                        System.out.print("І'мя >> ");
                        String name = new Scanner(System.in).nextLine();
                        if (name.length() < 4) {
                            System.out.println("Ім'я недопустиме!");
                            break;
                        }
                        name = toUpFirstChar(name);

                        System.out.print("Прізвище >> ");
                        String lastName = new Scanner(System.in).nextLine();
                        if (lastName.length() < 4) {
                            System.out.println("Прізвище недопустиме!");
                            break;
                        }
                        lastName = toUpFirstChar(lastName);

                        if (rada.checkDeputyIdentity(name, lastName)) break;

                        try {
                            System.out.print("Вага >> ");
                            int weight = new Scanner(System.in).nextInt();
                            System.out.print("Висота >> ");
                            int height = new Scanner(System.in).nextInt();

                            System.out.println("Хабарник (1 - так, 2 - ні)");
                            System.out.print("Хабарник >> ");
                            String briberScanner = new Scanner(System.in).nextLine();
                            boolean briber;
                            if (briberScanner.equalsIgnoreCase("1"))
                                briber = true;
                            else if (briberScanner.equalsIgnoreCase("2"))
                                briber = false;
                            else {
                                System.out.println("Такого варіанту не має!");
                                break;
                            }

                            Deputy deputy = new Deputy(name, lastName,weight,height,briber);

                            System.out.println("До фракції додано нового депутата!");
                            rada.addDeputyToFraction(fractionName6, deputy);
                        } catch (Exception e) {
                            System.out.println("Вага/висота повинна бути в числах");
                        }
                    } else {
                        System.out.println("Такої фракції не знайдено!");
                    }
                    break;
                case "7":
                    System.out.println("Вигнати депутата із фракції");
                    System.out.print("Введіть назву фракції >> ");
                    String fractionName7 = new Scanner(System.in).nextLine();

                    if(rada.checkFraction(fractionName7)) {
                        System.out.print("Введіть ім'я депутата >> ");
                        String name = new Scanner(System.in).nextLine();

                        System.out.print("Введіть прізвище депутата >> ");
                        String lastName = new Scanner(System.in).nextLine();

                        rada.removeDeputyFromFraction(fractionName7, name, lastName);
                    } else {
                        System.out.println("Фракцію не знайдено!");
                    }
                    break;
                case "8":
                    if (rada.getFractions().isEmpty())
                        System.out.println("Список фракцій пустий!");
                    System.out.println("Список хабарників");
                    rada.findAllBribers();
                    break;
                case "9":
                    System.out.println("Найбільший хабарник");
                    rada.findBestBriber();
                    break;
                case "0":
                    System.out.println("Дати хабаря");
                    System.out.println("Введіть ім'я >> ");
                    String name = new Scanner(System.in).nextLine();
                    System.out.println("Введіть прізвище >> ");
                    String lastName = new Scanner(System.in).nextLine();
                    if (!rada.checkDeputyIdentity(name, lastName)) {
                        System.out.println("Такого депутата не знайдено!");
                        break;
                    }

                    try {
                        System.out.print("Введіть суму хабаря >> ");
                        int sum = new Scanner(System.in).nextInt();
                        rada.giveBribe(name, lastName,sum);
                    } catch (Exception e) {
                        System.out.println("Не правильно введенечисло хабаря!");
                    }
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    private static String toUpFirstChar(String name) {
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }
}