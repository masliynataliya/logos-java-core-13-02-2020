package homework.romanivanov.javacore.jc13hw;

import java.util.Comparator;
import java.util.Scanner;

public class Deputy extends Person implements Comparable<Deputy> {
    private int age;
    private String name;
    private String surname;
    private boolean grafter;
    private int bribe;
    public Deputy(int weight, int height) {
        super(weight, height);
        bribe = getBribe();
    }

    public Deputy(int weight, int height, int age, String name, String surname, boolean grafter) {
        super(weight, height);
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.grafter = grafter;
        int bribe = 0;
    }

    public void bribeDeputy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть суму хабаря для: " + getName()+ " " + getSurname());
        int amount = sc.nextInt();
        if (grafter) {
            if (amount >= 5000) {
                System.out.println("Міліція увязнить депутата цього депутата" + getName()+ " " + getSurname());
            } else {
                bribe = amount;
            }

        } else System.out.println("Цей депутат не бере хабаря" + getName()+ " " + getSurname());

    }

    @Override
    public String toString() {
        return "Deputy{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grafter=" + grafter +
                ", bribe=" + bribe +
                '}';
    }

    public int getBribe() {
        return bribe;
    }

    public Deputy setBribe(int bribe) {
        this.bribe = bribe;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Deputy setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public Deputy setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Deputy setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public boolean isGrafter() {
        return grafter;
    }

    public Deputy setGrafter(boolean grafter) {
        this.grafter = grafter;
        return this;
    }



    @Override
    public int compareTo(Deputy deputy) {
        return getName().compareTo(deputy.getName());
    }
}
