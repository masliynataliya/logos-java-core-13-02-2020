package homework.romanivanov.javacore.jc22hw.task1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Cat());
        pets.add(new Cow());
        pets.add(new Cat());
        pets.forEach(Pet::voice);
    }
}
