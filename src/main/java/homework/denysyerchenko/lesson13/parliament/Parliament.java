package homework.denysyerchenko.lesson13.parliament;

import java.util.ArrayList;
import java.util.Scanner;

public final class Parliament {
    private static Parliament instance;



    private Parliament() {

    }

    public static Parliament getInstance() {
        if (instance == null) {
            instance = new Parliament();
        }
        return instance;
    }

    public ArrayList<Fraction> getFractionArrayList() {
        return fractionArrayList;
    }

    private ArrayList<Fraction> fractionArrayList = new ArrayList<>();

    public void addFraction() {
        Fraction fraction = new Fraction();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fraction's name");
        fraction.setFractionName(scanner.next());
        fractionArrayList.add(fraction);
    }

    public void removeFraction() {
        System.out.println("Enter fraction's name");
        Scanner scanner = new Scanner(System.in);
        String fractionToRemove = scanner.next();
        for (int i = 0; i < fractionArrayList.size(); i++) {
            if (fractionToRemove.equalsIgnoreCase(fractionArrayList.get(i).getFractionName())) {
                fractionArrayList.remove(i);
            } else {
                System.out.println("This fraction wasn't found");
            }
        }
    }

    public void showAllFractions() {
        System.out.println(fractionArrayList);
    }

    public void showCertainFraction() {
        System.out.println("Enter fraction's name");
        Scanner scanner = new Scanner(System.in);
        String fractionToShow = scanner.next();
        for (int i = 0; i < fractionArrayList.size(); i++) {
            if (fractionToShow.equalsIgnoreCase(fractionArrayList.get(i).getFractionName())) {
                System.out.println(fractionArrayList.get(i));
            } else {
                System.out.println("This fraction wasn't found");
            }
        }
    }

    public void addDeputyToCertainFraction() {
        System.out.println("Enter desired fraction's name");
        Scanner additionDeputyToFraction = new Scanner(System.in);
        String desiredFraction = additionDeputyToFraction.next();
        for (int i = 0; i < fractionArrayList.size(); i++) {
            if (desiredFraction.equalsIgnoreCase(fractionArrayList.get(i).getFractionName())) {
                fractionArrayList.get(i).addDeputy();
            } else {
                System.out.println("This fraction wasn't found");
            }
        }
    }

    public void removeDeputyFromParliament() {
        System.out.println("Enter deputy's surname");
        Scanner scanner = new Scanner(System.in);
        String desiredDeputy = scanner.next();
        for (int rd = 0; rd < fractionArrayList.size(); rd++) {
            Fraction targetFraction = fractionArrayList.get(rd);
            for (int tf = 0; tf < targetFraction.getDeputyArrayList().size(); tf++) {
                Deputy desDeputy = targetFraction.getDeputyArrayList().get(tf);
                if (desiredDeputy.equalsIgnoreCase(desDeputy.getSurname())) {
                    fractionArrayList.remove(tf);
                } else {
                    System.out.println("This surname wasn't found");
                }
                break;
            }
        }
    }

    public void showAllBribersInFraction() {
        System.out.println("Enter fraction's name");
        Scanner scanner = new Scanner(System.in);
        String desFract = scanner.next();
        for (int i = 0; i < fractionArrayList.size(); i++) {
            Fraction targetFraction2 = fractionArrayList.get(i);
            if (targetFraction2.getFractionName().equalsIgnoreCase(desFract)) {
                targetFraction2.showAllBribers();
            } else {
                System.out.println("This fraction wasn't found");
            }

        }
    }

    public void showWorstBriberInFraction() {
        System.out.println("Enter fraction's name");
        Scanner scanner = new Scanner(System.in);
        String desFract2 = scanner.next();
        for (int i = 0; i < fractionArrayList.size(); i++) {
            Fraction targetFraction3 = fractionArrayList.get(i);
            if (targetFraction3.getFractionName().equalsIgnoreCase(desFract2)) {
                targetFraction3.showWorstBriber();
            } else {
                System.out.println("This fraction wasn't found");
            }
        }
    }

    public void showAllDeputiesInFraction() {
        System.out.println("Enter fraction's name");
        Scanner scanner = new Scanner(System.in);
        String desFract3 = scanner.next();
        for (int i = 0; i < fractionArrayList.size(); i++) {
            Fraction targetFraction4 = fractionArrayList.get(i);
            if (targetFraction4.getFractionName().equalsIgnoreCase(desFract3)) {
                targetFraction4.showAllDeputies();
            } else {
                System.out.println("This fraction wasn't found");
            }
        }
    }

    @Override
    public String toString() {
        return "Parliament{" +
                "fractionArrayList=" + fractionArrayList +
                '}';
    }
}
