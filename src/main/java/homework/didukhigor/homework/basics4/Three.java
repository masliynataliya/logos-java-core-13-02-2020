package homework.didukhigor.homework.basics4;

public class Three {
    public static void main(String[] args) {

        int i = 4;
        int a = (i % 2);
        if (a == 0) {
            System.out.println("Число є парним.");

        } else if (a > 0){
            System.out.println("Число є непарним.");
        }
        else{
            System.out.println("Введіть ціле число!!!");
        }
    }
}
