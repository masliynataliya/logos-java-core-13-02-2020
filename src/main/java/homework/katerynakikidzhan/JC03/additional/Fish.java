package homework.katerynakikidzhan.JC03.additional;

public class Fish {
//    1. Створити клас Fish з параметрами ім’я, колір, розмір.
//    Створити якумога більше конструкторів до цього класу
//    (поекспериментуйте з порядком і кількістю параметрів — можна створити конструктор з 0, 1, 2 … всіма параметрами).
//    Створити стільки рибок, скільки конструкторів ви створили — по одній рибці на кожен конструктор. 
    private String name;
    private String colour;
    private String size;
    private String breed;

    public Fish() {
        this.colour = "unknown";
        this.name = "Unknown";
        this.size = "unknown";
        this.breed = "unknown";
    }

    public Fish(String name) {
        this.colour = "unknown";
        this.name = name;
        this.size = "unknown";
        this.breed = "unknown";
    }

    public Fish(String name, String colour) {
        this.name = name;
        this.colour = colour;
        this.size = "unknown";
        this.breed = "unknown";
    }

    public Fish(String name, String colour, String size) {
        this.name = name;
        this.colour = colour;
        this.size = size;
        this.breed = "unknown";
    }

    public Fish(String name, String colour, String size, String breed) {
        this.name = name;
        this.colour = colour;
        this.size = size;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name = '" + name + '\'' +
                ", colour = '" + colour + '\'' +
                ", size = '" + size + '\'' +
                ", breed = '" + breed + '\'' +
                '}';
    }
}
