package homework.denysyerchenko.lesson03.rectangle.cats;

public class Cat {
    public String name;
    public int age;
    public int power;

    public Cat(String initName, int initAge, int initPower) {
        name = initName;
        age = initAge;
        power = initPower;
    }
    public boolean attack(Cat anotherCat) {
        if (this.age < anotherCat.age && this.power > anotherCat.power) {
            System.out.println("Cat " + this.name + " wins!");
            return  true;
        } else if (this.age > (anotherCat.age * 0.75) && this.power > anotherCat.power) {
            System.out.println("Cat " + this.name + " wins!");
            return true;
        } else if (this.age < anotherCat.age && this.power > (anotherCat.power * 0.75)) {
            System.out.println("Cat " + this.name + " wins!");
            return true;
        } else {
            System.out.println("Cat " + this.name + " lost!");
            return false;
        }
    }
}
