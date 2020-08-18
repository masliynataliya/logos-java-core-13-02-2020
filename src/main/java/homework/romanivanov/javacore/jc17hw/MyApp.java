package homework.romanivanov.javacore.jc17hw;

public class MyApp {
    public static void main(String[] args) {
        Number[] numbers = {13, 14, 17, 19, 20, 23, 25, 50, 30, 41, 100, 50};
        MyCollection myCollection = new MyCollection(numbers);

//        MyIterator forward = myCollection.createForward(); //1 завдання
//        while (forward.hasNext()) {
//            System.out.println(forward.next());
//        }
//
//        System.out.println();
//
//        MyIterator backward = myCollection.createBackward(); //2 завдання
//
//        while (backward.hasNext()) {
//            System.out.println(backward.next());
//        }
//        System.out.println();

        MyIterator anonimClass = myCollection.anonim(); //3 завдання
        while (anonimClass.hasNext()) {
            System.out.println(anonimClass.next());
        }
        System.out.println();


//        MyIterator localClassExample = myCollection.example();  // 4 завдання
//        while (localClassExample.hasNext()) {
//            System.out.println(localClassExample.next());
//        }
//        System.out.println();
//
//
//        MyIterator staticClassExample = myCollection.createStatic();//5 завдання
//        while (staticClassExample.hasNext()) {
//            System.out.println(staticClassExample.next());
//        }
//

    }
}
