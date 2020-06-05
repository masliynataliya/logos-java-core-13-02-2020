package homework.ihorpayensky.homeworks.homework10.minplan.task2;

class Main {
    public static void main(String[] args) {

        String text = "Замініть всі голосні букви в тексті на тире";

        String t = text.replace("а", "-")
                        .replace("о", "-")
                        .replace("у", "-")
                        .replace("е", "-")
                        .replace("и", "-")
                        .replace("і", "-");

        System.out.println(text);
        System.out.println(t);
    }
}
