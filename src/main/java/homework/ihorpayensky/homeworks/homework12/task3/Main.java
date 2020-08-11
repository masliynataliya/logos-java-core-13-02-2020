package homework.ihorpayensky.homeworks.homework12.task3;

class Main {
    public static void main(String[] args) {

        System.out.println("ARRAY 1");
        ArrayAnalog<String> arr1 = new ArrayAnalog<>();
        System.out.println("Start size: " + arr1.getSize());

        arr1.add("hello");
        System.out.println("Edit size: " + arr1.getSize());
        System.out.println("Elements: " + arr1.toString());

        arr1.add("Frodo");
        System.out.println("Edit size: " + arr1.getSize());
        System.out.println("Elements: " + arr1.toString());

        arr1.removeByIndex(0);
        System.out.println("Edit size: " + arr1.getSize());
        System.out.println("Elements: " + arr1.toString());

        System.out.println("\n ARRAY 2");
        ArrayAnalog<Integer> arr2 = new ArrayAnalog<>();
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        arr2.add(7);

        System.out.println("Edit size: " + arr2.getSize());
        System.out.println("Elements: " + arr2.toString());

        arr2.removeByIndex(1);
        System.out.println("Edit size: " + arr2.getSize());
        System.out.println("Elements: " + arr2.toString());

    }
}
