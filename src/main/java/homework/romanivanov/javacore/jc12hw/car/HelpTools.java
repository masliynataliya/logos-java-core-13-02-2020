package homework.romanivanov.javacore.jc12hw.car;

public class HelpTools {


    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
