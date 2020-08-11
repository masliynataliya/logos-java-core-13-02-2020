package homework.ihorpayensky.homeworks.homework12.task3;

import java.util.ArrayList;
import java.util.List;

class ArrayAnalog<T> {
    private List<T> arr;

    public ArrayAnalog() {
        this.arr = new ArrayList<>();
    }

    public void add(T t) {
        arr.add(t);
    }
    public int getSize() {
        return arr.size();
    }
    public void removeByIndex(int index) {
        if (arr.get(index) != null) {
            arr.remove(index);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.arr.size(); i++) {
            s += "[" + arr.get(i) + "] ";
        }
        return s;
    }
}
