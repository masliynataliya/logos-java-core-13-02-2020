package homework.romanivanov.javacore.jc18hw.mapKV;

public interface MyMapInterface<K,V> {
    void put(K key, V value);
    void removeByKey(K key);
    void removeByValue(V value);
    void setKey();
    void listValue();

}
