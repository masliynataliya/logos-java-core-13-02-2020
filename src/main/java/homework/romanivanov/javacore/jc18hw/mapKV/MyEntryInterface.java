package homework.romanivanov.javacore.jc18hw.mapKV;

public interface MyEntryInterface<K,V> {
    K getKey();
//    K setKey();
    V getValue();
    V setValue(V value);
}
