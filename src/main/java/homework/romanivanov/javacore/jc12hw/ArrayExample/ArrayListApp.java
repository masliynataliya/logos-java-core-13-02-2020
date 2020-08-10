package homework.romanivanov.javacore.jc12hw.ArrayExample;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.addI(95);
        arrayListExample.addB(false);
        arrayListExample.addS("Roma");
        System.out.println(arrayListExample.toString());
        arrayListExample.remove(0);
        arrayListExample.remove(0);
        arrayListExample.remove(0);
        System.out.println(arrayListExample.toString());


    }


}
