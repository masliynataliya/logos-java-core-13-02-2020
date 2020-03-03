package homework.romanivanov.javacore.jc03.additional;

public class Cats {
    private int hp = 1000;
    private   String name;
    private int strength;
    private int  age;
    private int luck;
    private int x = 0;
    private int z = 0;

    public Cats (String name, int strength, int age,int luck){
        this.name = name;
        this.strength = strength;
        this.age = age;
        this.luck = luck;
    }
    public void fightCat(Cats anotherCat){
        while (hp>=1000) {
            int a = (int) (Math.random() * this.luck) + (this.strength - this.age);
            int b = (int) (Math.random() * anotherCat.luck) + (anotherCat.strength - anotherCat.age);
            x = a + x;
            z = b + z;
            if (x > hp) {
                System.out.println("Перший кіт переміг");
                break;

            }
            if (z > hp) {
                System.out.println("Другий кіт переміг");
                break;

            }

        }

    }


}
