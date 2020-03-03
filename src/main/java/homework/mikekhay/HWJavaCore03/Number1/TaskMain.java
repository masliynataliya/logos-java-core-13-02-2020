package homework.mikekhay.HWJavaCore03.Number1;

import homework.mikekhay.HWJavaCore03.Number2.Circle;

public class TaskMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle() {
            @Override
            public void calPlos() {
                super.calPlos();
            }
        };
        Rectangle r2 = new Rectangle(8, 8) {
            @Override
            public void calPer() {
                super.calPer();
            }
        };

        r1.calPlos();
        r2.calPer();

    }
}
