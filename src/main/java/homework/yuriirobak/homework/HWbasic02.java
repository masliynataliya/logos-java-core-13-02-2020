package homework.yuriirobak.homework;

public class HWbasic02 {
    public static void main(String args[]) {

        int firstNumber = 2; //a
        int secondNumber = 3; //b
        int thirdNumber = 18; // c
        int Discriminator = ((secondNumber * secondNumber) - 4 * firstNumber * thirdNumber);// D

        if (Discriminator > 0) {
            int x1 = (-secondNumber + Discriminator) / (2 * firstNumber);
            int x2 = (-secondNumber - Discriminator) / (2 * firstNumber);

            System.out.println("The two roots of the equation" + x1 + x2);


        } else if (Discriminator == 0) {
            int x1 = (-secondNumber) / (2 * firstNumber);
            int x2 = (-secondNumber) / (2 * firstNumber);

            System.out.println("The one roots of the equation" + x1);


        } else if (Discriminator < 0) {

            System.out.println("No real roots ");

        }
    }
}

