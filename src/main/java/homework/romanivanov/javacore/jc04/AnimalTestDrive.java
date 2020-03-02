package homework.romanivanov.javacore.jc04;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Animal an1 = new Animal("Monkey",7,20);
        an1.getName();
        an1.getSpeed();
        an1.getAge();
        System.out.println(an1);
        an1.setAge(34);
        an1.setName("Tiger");
        an1.setSpeed(120);
        System.out.println(an1);



    }
}
