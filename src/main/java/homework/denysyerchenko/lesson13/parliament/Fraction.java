package homework.denysyerchenko.lesson13.parliament;

import java.util.ArrayList;
import java.util.Scanner;

public class Fraction {
    private ArrayList <Deputy> deputyArrayList;

     public void addDeputy() {
         Deputy deputy = new Deputy();
         Scanner newDeputyScanner = new Scanner(System.in);
         System.out.println("Enter deputy's surname");
         deputy.setSurname(newDeputyScanner.next());
         System.out.println("Enter deputy's name");
         deputy.setName(newDeputyScanner.next());
         System.out.println("Enter deputy's age");
         deputy.setAge(newDeputyScanner.nextInt());
         System.out.println("Is the deputy a briber?");
         deputy.setBriber(newDeputyScanner.nextBoolean());
         System.out.println("Enter deputy's height");
         deputy.setHeight(newDeputyScanner.nextInt());
         System.out.println("Enter deputy's weight");
         deputy.setWeight(newDeputyScanner.nextInt());
         deputyArrayList.add(deputy);
     }
     public void removeDeputy() {
         System.out.println("Enter the deputy's surname");
         Scanner removingDeputyScanner = new Scanner(System.in);
         String deputyToRemove = removingDeputyScanner.next();
         for (int d = 0; d < deputyArrayList.size(); d++) {
             if (deputyToRemove.equalsIgnoreCase(deputyArrayList.get(d).getSurname())) {
                 deputyArrayList.remove(d);
             } else {
                 System.out.println("This surname wasn't found");
             }
         }
     }
     public void showAllBribers() {
         for (int d2 = 0; d2 < deputyArrayList.size(); d2++) {
             if (deputyArrayList.get(d2).isBriber() == true) {
                 System.out.println(deputyArrayList.get(d2));
             }
         }
     }
     public void showWorstBriber() {
         Deputy worstBriber = deputyArrayList.get(0);
         for (int d3 = 0; d3 < deputyArrayList.size(); d3++) {
             Deputy currentBriber = deputyArrayList.get(d3);
             if (currentBriber.getBribe() > worstBriber.getBribe()) {
                 currentBriber = worstBriber;
             }
         }
         System.out.println(worstBriber);
     }
     public void showAllDeputies() {
         System.out.println(deputyArrayList);
     }
     public void removeAllDeputies() {
         deputyArrayList.removeAll(deputyArrayList);
         System.out.println("All deputies have been removed");
     }
}
