package homework.romanivanov.javacore.jc12hw.ArrayExample;

import java.util.ArrayList;

public class ArrayListExample {

    ArrayList arrayList = new ArrayList();

    @Override
    public String toString() {
        return "ArrayListExample{" +
                "arrayList=" + arrayList +
                '}';
    }

    public void addI(int number) {
        arrayList.add(number);
    }

    public void addS(String stringExample) {
        arrayList.add(stringExample);
    }

    public void addB(Boolean booleanExample) {
        arrayList.add(booleanExample);
    }

    public void remove(int index) {
        arrayList.remove(index);
    }
}
