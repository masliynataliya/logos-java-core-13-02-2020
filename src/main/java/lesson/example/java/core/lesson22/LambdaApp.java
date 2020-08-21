package lesson.example.java.core.lesson22;

public class LambdaApp {

    public static void main(String[] args) {

        // однакові результати досягнені через (1) Анонімний клас і (2) лямбда
        MathOperation addAnonymous = getAnonymousAdd();
        MathOperation add = (x,y) -> {return x+y;};


        MathOperation subtract = (x,y) -> {return x-y;};
        MathOperation multiply = (x,y) -> {return x*y;};
        MathOperation divide = (x,y) -> {return x/y;};

        System.out.println(add.execute(2,3));
        System.out.println(subtract.execute(2,3));
        System.out.println(multiply.execute(2,3));
        System.out.println(divide.execute(2,3));
    }

    private static MathOperation getAnonymousAdd() {
        return new MathOperation() {

            @Override
            public int execute(int a, int b) {
                return a + b;
            }
        };
    }
}

interface MathOperation {

    int execute(int a, int b);

}
