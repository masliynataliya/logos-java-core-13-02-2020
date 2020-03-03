package homework.romanivanov.javacore.jc03.additional;

public class FishTestDrive {

    public static void main(String[] args) {
        Fish[] fishes = new Fish[9];
        //роблю масив fishes, для того щоб компактніше виглядали Об'єкти Fish
        fishes[0] = new Fish();
        fishes[1] = new Fish("Red");
        fishes[2] = new Fish (24);
        fishes[3] = new Fish(34, "Blue");
        fishes[4] = new Fish("Barsik", 21);
        fishes[5] = new Fish("Dou", "Yellow");
        fishes[6] = new Fish("Black", "Persik", 10);
        fishes[7] = new Fish ("Purple,",5,"Betsy");
        fishes[8] = new Fish(999,"Teal", "Eyjafjallajokull");



        for (int b = 0;b<9;++b){
            System.out.println(fishes[b]);
            //Цикл щоб не повторювати код для кожного об'єкту
        }


    }
}
