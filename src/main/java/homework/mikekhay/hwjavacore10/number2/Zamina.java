package homework.mikekhay.hwjavacore10.number2;

public class Zamina {


        public static void main(String[] args) {
            String text = "Mother and father my parents. Тато і мама є мої батьки.";
            System.out.println("Текст до заміни    = " + text);
            text = text.replace("a", "-");
            text = text.replace("e", "-");
            text = text.replace("y", "-");
            text = text.replace("u", "-");
            text = text.replace("i", "-");
            text = text.replace("o", "-");
            text = text.replace("а", "-");
            text = text.replace("о", "-");
            text = text.replace("у", "-");
            text = text.replace("и", "-");
            text = text.replace("і", "-");
            text = text.replace("е", "-");
            System.out.println("Текст після заміни = " + text);
        }
    }
