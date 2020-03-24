package homework.didukhigor.homework.javacore5.amphibia;
// Створіть клас з іменем Amphibia, створіть клас Frog, який унаслідується від Amphibia.
//Створіть в класі Amphibia методи : (їсти, спати , плавати, гуляти),
// які виводитимуть будь- який текст на консоль. Створіть в мейн методі екземпляр класу Frog,
// приведіть його до типу Amphibia , і викличте до об’єкту Frog всі методи класу Amphibia.

public class Main {

    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibia amphibia = new Frog();
        frog.eat();
        frog.sleep();
        frog.swim();
        frog.walk();

    }

}
