package homework.romanivanov.javacore.jc12hw.ArrayExample;


public class ArrayListApp {
    public static void main(String[] args) {
        ArrayListExample<Integer> test = new ArrayListExample<>();
        System.out.println(test.size());
        test.add(24);
        System.out.println(test.toString());
        test.replace(24, 30);
        System.out.println(test.toString());
        test.remove(30);
        System.out.println(test.toString());


    }
}
