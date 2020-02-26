package homework.denysyerchenko;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        System.out.println("ax^2 + bx + c = 0");
        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int A = in.nextInt();
        System.out.print("Input B: ");
        int B = in.nextInt();
        System.out.print("Input C: ");
        int C = in.nextInt();
        int a, b, c;
        a = A;
        b = B;
        c = C;
        int D;
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("If a = " + a + ", b = " + b + ", c = " + c);
            System.out.println(" then");
            System.out.println("x1 =" + x1);
            System.out.println("x2 =" + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x =" + x);
        } else if (D < 0) {
            System.out.println("The equation has no roots");
        }
    }
}
