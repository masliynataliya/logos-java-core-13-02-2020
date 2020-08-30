package homework.mikekhay.hwjavacore17;

public class MyApp {
    public static void main(String[] args) {
        Number[] numbers = {13, 15, 18, 19, 21, 28, 11, 30, 45, 36};

        for (Number n: numbers) {
            System.out.print(n + " ");
        }
        System.out.println();


        MyCollection myCollection = new MyCollection(numbers);


        MyIterator forward = myCollection.createForward();
        while (forward.hasNext()){
            System.out.print(forward.next() + " ");
        }
        System.out.println();


        MyIterator backward = myCollection.createBackward();
        while (backward.hasNext()){
            System.out.print(backward.next() + " ");
        }
    }
}
