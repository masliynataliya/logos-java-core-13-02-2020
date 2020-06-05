package homework.ihorpayensky.homeworks.homework09.task1;

import homework.romanivanov.javacore.jc08hw.Month;

import java.util.Scanner;

class Main {
    public static void main(String[] args) throws WrongInputConsoleParametersException {
        try {
            getTask();
        } catch (WrongInputConsoleParametersException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Привіт, не очікував? а я появився! Подумай чому, добре подумай, а може такого місяця не існує?");
        }

    }

    private static void getTask() throws WrongInputConsoleParametersException {
        System.out.print("Enter a month: ");
        String month = new Scanner(System.in).nextLine().toUpperCase();

        System.out.print("Enter a number of task: ");
        Scanner scanner = new Scanner(System.in);

        int task;
        if (!scanner.hasNextBigInteger()) {
            throw new WrongInputConsoleParametersException("Таски номеруються тільки цілими числами!");
        } else {
            task = scanner.nextInt();
        }

        System.out.println(" ===");


        switch (task) {
            case 1:
                System.out.println(Months.valueOf(month));
                break;
            case 2:
                for (Months e: Months.values())
                    if (e.getSeason().equals(Months.valueOf(month).getSeason()))
                        System.out.println(e);
                break;
            case 3:
                for (Months e: Months.values())
                    if (e.getDay() == Months.valueOf(month).getDay())
                        System.out.println(e);
                break;
            case 4:
                for (Months e: Months.values())
                    if (e.getDay() > Months.valueOf(month).getDay())
                        System.out.println(e);
                break;
            case 5:
                for (Months e: Months.values())
                    if (e.getDay() < Months.valueOf(month).getDay())
                        System.out.println(e);
                break;
            case 6:
                for (int i = 0; i < Seasons.values().length; i++)
                    if (Seasons.values()[i].equals(Months.valueOf(month).getSeason()))
                        System.out.println(Seasons.values()[(i+1)%4]);
                break;
            case 7:
                for (int i = 0; i < Seasons.values().length; i++)
                    if (Seasons.values()[i].equals(Months.valueOf(month).getSeason()))
                        System.out.println(Seasons.values()[ i == 0 ? Seasons.values().length-1 : (i-1)%4]);
                break;
            case 8:
                for (Months e: Months.values())
                    if (e.getDay() %2 == 0)
                        System.out.println(e);
                break;
            case 9:
                for (Months e: Months.values())
                    if (e.getDay() %2 != 0)
                        System.out.println(e);
                break;
            case 10:
                if (Months.valueOf(month).getDay() %2 == 0)
                    System.out.println(Months.valueOf(month) + " має парну кількість днів!");
                else System.out.println(Months.valueOf(month) + " має не парну кількість днів!");
                break;
            default:
                throw new WrongInputConsoleParametersException("Такого завдання немає!)");
        }
    }
}
