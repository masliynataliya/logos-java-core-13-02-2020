package homework.ihorpayensky.homeworks.homework08.task1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try {
            System.out.print("Enter a month: ");
            String month = new Scanner(System.in).nextLine().toUpperCase();

            System.out.print("Enter a number of task: ");
            int task = new Scanner(System.in).nextInt();

            System.out.println(" ===");
            getTask(month, task);

        } catch (Exception e) {
            System.out.println("Такого місяця не існує");
        }
    }

    private static void getTask(String month, int task) {
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
                for (int i = 0; i < Months.values().length; i++)
                    if (Months.valueOf(month) == Months.values()[i])
                        System.out.println(Months.values()[(i+1)%12]);
                break;
            case 7:
                for (int i = 0; i < Months.values().length; i++)
                    if (Months.valueOf(month) == Months.values()[i])
                        System.out.println(Months.values()[ i == 0 ? Months.values().length-1 : (i-1)%12]);
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
                System.out.println("Такого завдання не має!");
                break;
        }
    }
}
