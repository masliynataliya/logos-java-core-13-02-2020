package homework.mikekhay.hwjavacore13.number1;

import java.util.Scanner;

public class Deputy extends People implements Comparable<Deputy>{
    private String surName;
    private String name;
    private int age;
    private boolean bribe;
    private int sizeBribe;

    public Deputy(int weight, int growth) {
        super(weight, growth);
        sizeBribe=getSizeBribe();
    }

    public Deputy(int weight, int growth, String surName, String name, int age, boolean bribe) {
        super(weight, growth);
        this.surName = surName;
        this.name = name;
        this.age = age;
        this.bribe = bribe;
        sizeBribe = 0;
    }

    public void giveBribeDeputy(){
        System.out.println("Введыть суму хабаря : " + getSurName() + " " + getName());
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (bribe){
            if( 5000 <= a ){
                System.out.println("Міліція увязнити депутата : " + getSurName() + " " + getName());
            }
            else{
                sizeBribe = a;
            }
        }
        else {
            System.out.println("Даний депутат не бере хабаря : " + getSurName() + " " + getName());
        }
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isBribe() {
        return bribe;
    }

    public int getSizeBribe() {
        return sizeBribe;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBribe(boolean bribe) {
        this.bribe = bribe;
    }

    public void setSizeBribe(int sizeBribe) {
        this.sizeBribe = sizeBribe;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bribe=" + bribe +
                ", sizeBribe=" + sizeBribe +
                '}';
    }

    @Override
    public int compareTo(Deputy deputy) {
        return getName().compareTo(deputy.getName());
    }
}