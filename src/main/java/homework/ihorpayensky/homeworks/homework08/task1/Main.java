package homework.ihorpayensky.homeworks.homework08.task1;

import java.awt.event.MouseEvent;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try {
            System.out.print("Enter a season: ");
            Scanner scanner = new Scanner(System.in);
            String day = scanner.nextLine().toUpperCase();


            // 1
            System.out.println("\t# 1");
            if (Months.valueOf(day) != null) {
                System.out.println(Months.valueOf(day));
            }

            // 2
            System.out.println("\t# 2");
            for (var e: Months.values()) {
                if (e.getSeason().equals(Months.valueOf(day).getSeason())){
                    System.out.println(e);
                }
            }

            // 3
            System.out.println("\t# 3");
            for (var e: Months.values()) {
                if (e.getDay() == Months.valueOf(day).getDay()){
                    System.out.println(e);
                }
            }

            // 4
            System.out.println("\t# 4");
            for (var e: Months.values()) {
                if (e.getDay() > Months.valueOf(day).getDay()){
                    System.out.println(e);
                }
            }

            // 5
            System.out.println("\t# 5");
            for (var e: Months.values()) {
                if (e.getDay() < Months.valueOf(day).getDay()){
                    System.out.println(e);
                }
            }

            // 6
            System.out.println("\t# 6");
            for (int i = 0; i < Months.values().length; i++) {
                if (Months.valueOf(day) == Months.values()[i]){
                    System.out.println(Months.values()[(i+1)%12]);
                }
            }

            // 7
            System.out.println("\t# 7");
            for (int i = 0; i < Months.values().length; i++) {
                if (Months.valueOf(day) == Months.values()[i]) {
                    System.out.println(Months.values()[ i == 0 ? Months.values().length-1 : (i-1)%12]);
                }
            }

            // 8
            System.out.println("\t# 8");
            for (var e: Months.values()) {
                if (e.getDay() %2 == 0) {
                    System.out.println(e);
                }
            }

            // 9
            System.out.println("\t# 9");
            for (var e: Months.values()) {
                if (e.getDay() %2 != 0) {
                    System.out.println(e);
                }
            }

            // 10
            System.out.println("\t# 10");
            if (Months.valueOf(day).getDay() %2 == 0)
                System.out.println(Months.valueOf(day) + " має парну кількість днів!");
            else System.out.println(Months.valueOf(day) + " має не парну кількість днів!");


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
