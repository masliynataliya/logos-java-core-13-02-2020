package homework.romanivanov.javacore.jc22hw.task5;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class AmphibiaTestDrive {
    public static void main(String[] args) {
        Supplier<Amphibia> frog =() -> new Frog(); //Frog::new;
        frog.get().chill();
        frog.get().eat();
        frog.get().move();
        frog.get().swim();


    }

}
