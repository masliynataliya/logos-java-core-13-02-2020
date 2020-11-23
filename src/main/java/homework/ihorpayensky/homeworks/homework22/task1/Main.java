package homework.ihorpayensky.homeworks.homework22.task1;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {

        List<Pet> petList = new ArrayList<>();
        petList.add(new Cow());
        petList.add(new Cow());
        petList.add(new Cat());
        petList.add(new Cat());
        petList.add(new Cow());
        petList.add(new Cow());
        petList.add(new Dog());
        petList.add(new Cow());
        petList.add(new Dog());
        petList.add(new Cat());

        petList.forEach(Pet::voice); // like for me it`s ok

    }
}
