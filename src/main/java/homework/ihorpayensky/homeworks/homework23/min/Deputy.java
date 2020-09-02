package homework.ihorpayensky.homeworks.homework23.min;

import java.util.Scanner;

class Deputy extends Human implements Comparable<Deputy> {

    private int id;
    private static int maxId = 0;

    private String firstName;
    private String lastName;
    private int age;
    private boolean briber;
    private int bribeSize = 0;

    public Deputy(String firstName, String lastName, int age, int weight, int height, boolean briber) {
        super(weight, height);
        this.id = maxId;
        maxId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.briber = briber;
    }

    public void giveBribe(Scanner scanner) {
        if (!this.briber) {
            System.out.println("Цей депутат не бере хабарів!");
            return;
        }
        System.out.print("Введіть розмір хабаря >> ");
        int bribe = scanner.nextInt();
        if (this.briber && bribe >= 5000) {
            System.out.println("Тікай з села, по тебе виїхали!");
            return;
        }
        System.out.println("Хабар " + bribeSize + "$ прийнято");
        this.bribeSize = bribe;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBriber() {
        return briber;
    }

    public void setBriber(boolean briber) {
        this.briber = briber;
    }

    public int getBribeSize() {
        return bribeSize;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", briber=" + briber +
                ", bribeSize=" + bribeSize +
                '}';
    }

    @Override
    public int compareTo(Deputy o) {
        if (this.getBribeSize() > o.getBribeSize())
            return 1;
        if (this.getBribeSize() == o.getBribeSize())
            return 0;
        return -1;
    }
}
