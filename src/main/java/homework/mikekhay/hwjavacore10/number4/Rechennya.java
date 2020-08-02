package homework.mikekhay.hwjavacore10.number4;

public class Rechennya {
    public static void main(String[] args) {
    String text = "MothEr and father my parents. Тато і мама є мої батьки. ";

    int a = 0;
    for(int i = 0; i < text.length() - 1; ++i) {
        if (text.charAt(i + 1) == '.' || text.charAt(i + 1) == '!' || text.charAt(i + 1) == '?' && text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?') {
            ++a;
        }
    }

    System.out.println("Ви ввели речень = " + a);
}
}
