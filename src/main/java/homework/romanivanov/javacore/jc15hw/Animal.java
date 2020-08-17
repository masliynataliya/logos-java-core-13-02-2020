package homework.romanivanov.javacore.jc15hw;

import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    private String typeOfAnimal;
    private String name;
Scanner sc = new Scanner(System.in);

    public Animal(String typeOfAnimal, String name) {
        this.typeOfAnimal = typeOfAnimal;
        this.name = name;
    }

    public Animal() {

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
    public Animal createAnimal() {
        Animal animal = new Animal();
        System.out.println("Введіть ім'я тваринки");
        String name = sc.next();
        System.out.println("Введіть тип тваринки");
        String type = sc.next();
        animal.setName(name);
        animal.setTypeOfAnimal(type);
        return animal;
    }

}
