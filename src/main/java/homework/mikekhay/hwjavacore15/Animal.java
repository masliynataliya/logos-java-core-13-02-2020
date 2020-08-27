package homework.mikekhay.hwjavacore15;

import java.util.Scanner;

public class Animal {
    private String typeAnimal;
    private String nameAnimal;

    public Animal(String typeAnimal, String nameAnimal) {
        this.typeAnimal = typeAnimal;
        this.nameAnimal = nameAnimal;
    }

    public Animal(){
        System.out.println("Введіть тип тваринки:");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        System.out.println("Введіть ім'я тваринки:");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.next();
        this.typeAnimal=type;
        this.nameAnimal=name;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    @Override
    public String toString() {
        return "\n     Animal{" +
                "typeAnimal='" + typeAnimal + '\'' +
                ", nameAnimal='" + nameAnimal + '\'' +
                '}';
    }
}
