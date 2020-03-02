package homework.katerynakikidzhan.JC03.additional;

//3. Створити клас Cat з параметрами ім’я, вік, сила.
// Створити конструктор. Придумайте алгоритм бійки котів (на основі параметрів вік, сила).
// Написати метод boolean attack(Cat anotherCat), який повертає true,
// той кіт, який напав, виграє, і false, якщо атакуючий кіт програє.

public class Cat {
    private String name;
    private int age;
    private double strength;
    private double power;

    public Cat(String name, int age, double strength) {
        this.name = name;
        this.age = age;
        this.strength = strength;
        this.power = this.age * 2 + this.strength / 3;
    }

    public Cat() {
        this.name = "Ginger";
        this.age = 1;
        this.strength = 19;
        this.power = this.age * 2 + this.strength / 3;
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

    public double getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean attack(Cat anotherCat) {
        return (power / 3) > (anotherCat.power / 3);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", strength=" + strength +
                ", power=" + power +
                '}';
    }
}
