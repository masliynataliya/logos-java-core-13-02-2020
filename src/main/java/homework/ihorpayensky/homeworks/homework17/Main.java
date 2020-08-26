package homework.ihorpayensky.homeworks.homework17;

class Main {
    public static void main(String[] args) {

        Collection collection = new Collection(new Integer[] {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9});
        Collection collection1 = new Collection(new Integer[] {1,2,2,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1});

        System.out.println(" === Task 1 === ");
        Iterator iterator1 = collection.getForward();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println(" === Task 2 === ");
        Iterator iterator2 = collection.getBackward();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println(" === Task 3 === ");
        Iterator iterator3 = collection.getIterator();
        while (iterator3.hasNext()){
            System.out.println(iterator3.next());
        }

        System.out.println(" === Task 4 === ");
        Iterator iterator4 = collection.getTask4();
        while (iterator4.hasNext()) {
            System.out.println(iterator4.next());
        }

        System.out.println(" === Task 5 === ");
        Collection.Task5 task5 = new Collection.Task5(collection);
        Iterator iterator5 = task5.getTask5();
        while (iterator5.hasNext()) {
            System.out.println(iterator5.next());
        }

    }
}
