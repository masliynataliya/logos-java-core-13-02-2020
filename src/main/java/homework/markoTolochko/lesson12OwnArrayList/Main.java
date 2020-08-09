package homework.markoTolochko.lesson12OwnArrayList;

public class Main {
    public static void main(String[] args) {

        OwnArrayList ownArrayList = new OwnArrayList();
        ownArrayList.addToArr(44);
        ownArrayList.addToArr(50);
        ownArrayList.addToArr(22);
        ownArrayList.addToArr(4);
        System.out.println(ownArrayList);
        System.out.println();
        ownArrayList.removeFromArr(2);
        System.out.println(ownArrayList);
    }
}
