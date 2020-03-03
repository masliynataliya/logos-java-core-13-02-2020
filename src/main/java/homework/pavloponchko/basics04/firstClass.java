package homework.pavloponchko.basics04;

public class firstClass {
    public static void main(String[] args) {
        //1 задача
        int[] number = new int[56];
        for (int counter = 1; counter < number.length; counter++) {
            number[counter] = counter;
        }
        for (int i = 1; i < 56; i = ++i) {
            System.out.println(number[i]);
        }
    }
}
