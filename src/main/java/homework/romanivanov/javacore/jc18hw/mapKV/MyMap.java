package homework.romanivanov.javacore.jc18hw.mapKV;

import java.util.Arrays;
import java.util.Iterator;

public class MyMap<K, V> implements MyMapInterface<K, V> {
    private final int DEFAULT_CAPACITY = 5;
    private MyEntry<K, V>[] myEntry;
    private int mapElements;
    private static final int MAP_SIZE_MULTIPLIER = 2;
    public MyMap() {
        this.myEntry = new MyEntry[DEFAULT_CAPACITY];
    }

    @Override
    public String toString() {
        return "MyMap: " + Arrays.deepToString(myEntry);
    }

    private boolean isArrayFull() {
        return myEntry.length == mapElements;
    }

    private int newCapacity() {
        return myEntry.length * MAP_SIZE_MULTIPLIER;
    }

    private void loadFactor() {
        for (MyEntry<K, V> entry : myEntry) {
            if (entry != null) {
                mapElements++;
            }
        }
        if (isArrayFull()) {
            this.myEntry = Arrays.copyOf(myEntry, newCapacity());
        }
        mapElements = 0;
    }


    @Override
    public void put(K key, V value) {
        loadFactor();
        for (int i = 0; i < myEntry.length; i++) {
            if (myEntry[i] != null){
            if (myEntry[i].getKey() == key) {
                myEntry[i].setValue(value);
                return;
            }
            }
                if (myEntry[i] == null) {
                    myEntry[i] = new MyEntry<>(key, value);
                    return;
                }

        }

    }

    @Override
    public void removeByKey(K key) {
        for (int i = 0; i < myEntry.length; i++ ){
            if (myEntry[i].getKey().equals(key)){
                myEntry[i] = null;
                return;
            }
        }

    }

    @Override
    public void removeByValue(V value) {
        for (int i = 0; i< myEntry.length; i++){
            if (myEntry[i] != null) {
                if (myEntry[i].getValue().equals(value)) {
                    myEntry[i] = null;
                }
            }
        }
    }

    @Override
    public void setKey() {
        for (int i = 0; i< myEntry.length;i++){
            if (myEntry[i] != null) {
                    System.out.println(myEntry[i].getKey().toString());
            }
        }
    }

    @Override
    public void listValue() {
        for (int i = 0; i< myEntry.length;i++) {
            if (myEntry[i] != null) {
                System.out.println(myEntry[i].getValue().toString());
            }
            }
        }

}
