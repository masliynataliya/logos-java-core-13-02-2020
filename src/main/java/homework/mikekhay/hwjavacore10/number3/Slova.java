package homework.mikekhay.hwjavacore10.number3;

public class Slova {
    public static void main(String[] args) {
        String text = "MothEr and father my parents. Тато і мама є мої батьки.";
        int text1 = text.split(" +").length;
        System.out.println("Ви ввели слів = " + text1);
    }
}
