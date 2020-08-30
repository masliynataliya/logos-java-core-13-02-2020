package homework.romanivanov.javacore.jc20hw.executor;

import java.util.ArrayList;
import java.util.List;

public class Fibonachi {

    public static  List<Integer> getNumbers(int size) {
         int x = 0;
         int y = 1;
         int z;
        List<Integer> fabionochi1 = new ArrayList<>();
        fabionochi1.add(x);
        fabionochi1.add(y);
        for (int i = 0; i < size - 2; i++) {
            z = x + y;
            x = y;
            y = z;
            fabionochi1.add(z);
        }
        return fabionochi1;
    }
}
