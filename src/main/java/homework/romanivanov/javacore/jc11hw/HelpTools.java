package homework.romanivanov.javacore.jc11hw;

public class HelpTools {


    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
