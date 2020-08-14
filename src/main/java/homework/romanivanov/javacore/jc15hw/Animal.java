package homework.romanivanov.javacore.jc15hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animal {
    private String typeOfAnimal;
    private String name;
ArrayList<Animal> animals;
Scanner sc = new Scanner(System.in);

    public Animal(String typeOfAnimal, String name) {
animals = new ArrayList<>();
        this.typeOfAnimal = typeOfAnimal;
        this.name = name;
    }

    public Animal() {

animals = new ArrayList<>();
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
//        animals.add(animal);
        return animal; //зроби щоб анімал сетався в певний ліст, а не вертав ліст
    }
    public List<Animal> addAnimalToList(Animal animal) {
        animal = createAnimal();
        animals.add(animal);

        return animals;
    }
}
