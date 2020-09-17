package homework.denysyerchenko.lesson13.parliament;

import java.util.Scanner;

public class Deputy extends Man {
    private String surname;
    private String name;
    private int age;
    private boolean isBriber;
    private int bribe;

    public Deputy() {
    }

    public Deputy(int height, int weight, String surname, String name, int age, boolean isBriber) {
        super(height, weight);
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.isBriber = isBriber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBriber() {
        return isBriber;
    }

    public void setBriber(boolean briber) {
        isBriber = briber;
    }

    public int getBribe() {
        return bribe;
    }

    public void setBribe(int bribe) {
        this.bribe = bribe;
    }

    public void payABribe(boolean isBriber) {
        if (false) {
            System.out.println("This deputy is not a briber");
        } if (true) {
            System.out.println("Enter the bribe's amount");
            Scanner bribeScanner = new Scanner(System.in);
            int bribeAmount = bribeScanner.nextInt();
            if (bribeAmount <= 5000) {
                bribe = bribeAmount;
            } else {
                System.out.println("Deputy has been arrested");
            }
        }
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isBriber=" + isBriber +
                ", bribe=" + bribe +
                '}';
    }
}
