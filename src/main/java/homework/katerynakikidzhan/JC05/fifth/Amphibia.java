package homework.katerynakikidzhan.JC05.fifth;
// Створіть клас з іменем Amphibia, створіть клас Frog, який унаслідується від Amphibia.
// Створіть в класі Amphibia методи : (їсти, спати , плавати, гуляти), які виводитимуть будь- який текст на консоль.
// Створіть в мейн методі екземпляр класу Frog, приведіть його до типу Amphibia,
// і викличте до об’єкту Frog всі методи класу Amphibia.
public class Amphibia {
    public static String eat() {
        return "omnomnom";
    };

    public static String sleep() {
        return "zzzzzz";
    };

    public static String swim() {
        return "gurgle";
    };

    public static String walk() {
        return "lalalala";
    };
}