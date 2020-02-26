package homework.romanivanov;

public class Homework2 {
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        int c = 3;
        int D = ((b*b) - 4 * a * c);
        if (D>0) {
            double x1;
            double x2;
            x1 = (-b -Math.sqrt(D))/2*a;
            x2 = (-b + Math.sqrt(D))/2*a;
            System.out.println("Корені рівняння "+x1 +  x2);
        }
        else if (D==0){
            double x =(-b/(2*a));
            System.out.println("Єдиний корінь рівняння " +x);
        }
        else {
            System.out.println("Рівняння коренів не існує");
        }

    }
}
