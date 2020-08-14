package lesson.example.java.core.lesson17.hwexample;

public class MyApp {

    public static void main(String[] args) {
        Number[] numbers = {13, 15, 17, 19, 21, 23};

        MyCollection myCollection = new MyCollection(numbers);

        MyIterator forward = myCollection.createForward();

        while (forward.hasNext()) {
            System.out.println(forward.next());
        }

        System.out.println();

        MyIterator backward = myCollection.createBackward();

        while (backward.hasNext()) {
            System.out.println(backward.next());
        }
    }
}
