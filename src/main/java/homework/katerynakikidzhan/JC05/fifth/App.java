package homework.katerynakikidzhan.JC05.fifth;
// Створіть клас з іменем Amphibia, створіть клас Frog, який унаслідується від Amphibia.
// Створіть в класі Amphibia методи : (їсти, спати , плавати, гуляти), які виводитимуть будь- який текст на консоль.
// Створіть в мейн методі екземпляр класу Frog, приведіть його до типу Amphibia,
// і викличте до об’єкту Frog всі методи класу Amphibia.
public class App {
    public static void main(String[] args) {
        Amphibia amphibia = new Frog();

        System.out.println(amphibia.eat());
        System.out.println(amphibia.sleep());
        System.out.println(amphibia.swim());
        System.out.println(amphibia.walk());
    }
}
