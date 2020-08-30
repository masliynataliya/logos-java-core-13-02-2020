package homework.romanivanov.javacore.jc23hw.ZooClub;

import java.util.Scanner;

public class Animal {
    Scanner sc = new Scanner(System.in);
    private String typeOfAnimal;
    private String name;

    public Animal(String typeOfAnimal, String name) {
        this.typeOfAnimal = typeOfAnimal;
        this.name = name;
    }

    public Animal() {
        System.out.println("Введіть ім'я тваринки");
        String name = sc.next();
        System.out.println("Введіть тип тваринки");
        String type = sc.next();
        this.name = name;
        this.typeOfAnimal = type;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public Animal setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
        return this;
    }

    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "typeOfAnimal='" + typeOfAnimal + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
