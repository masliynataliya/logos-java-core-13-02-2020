package homework.denysyerchenko.lesson13.parliament;

import java.util.ArrayList;
import java.util.Scanner;

public class Fraction {
    private String fractionName;
    private ArrayList <Deputy> deputyArrayList = new ArrayList<>();

    public Fraction() {
    }

    public Fraction(String fractionName) {
        this.fractionName = fractionName;
    }

    public String getFractionName() {
        return fractionName;
    }

    public ArrayList<Deputy> getDeputyArrayList() {
        return deputyArrayList;
    }

    public void setFractionName(String fractionName) {
        this.fractionName = fractionName;
    }

    public void addDeputy() {
         Deputy deputy = new Deputy();
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter deputy's surname");
         deputy.setSurname(scanner.next());
         System.out.println("Enter deputy's name");
         deputy.setName(scanner.next());
         System.out.println("Enter deputy's age");
         deputy.setAge(scanner.nextInt());
         System.out.println("Is the deputy a briber?");
         deputy.setBriber(scanner.nextBoolean());
         System.out.println("Enter deputy's height");
         deputy.setHeight(scanner.nextInt());
         System.out.println("Enter deputy's weight");
         deputy.setWeight(scanner.nextInt());
         deputyArrayList.add(deputy);
     }
     public void removeDeputy() {
         System.out.println("Enter deputy's surname");
         Scanner scanner = new Scanner(System.in);
         String deputyToRemove = scanner.next();
         for (int i = 0; i < deputyArrayList.size(); i++) {
             if (deputyToRemove.equalsIgnoreCase(deputyArrayList.get(i).getSurname())) {
                 deputyArrayList.remove(i);
             } else {
                 System.out.println("This surname wasn't found");
             }
         }
     }
     public void showAllBribers() {
         for (int i = 0; i < deputyArrayList.size(); i++) {
             if (deputyArrayList.get(i).isBriber() == true) {
                 System.out.println(deputyArrayList.get(i));
             } else {
                 System.out.println("No bribers were found");
             }
         }
     }
     public void showWorstBriber() {
         Deputy worstBriber = deputyArrayList.get(0);
         for (int i = 0; i < deputyArrayList.size(); i++) {
             Deputy currentBriber = deputyArrayList.get(i);
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
