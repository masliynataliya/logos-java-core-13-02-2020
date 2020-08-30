package homework.romanivanov.javacore.jc18hw.mapKV;

public class MyEntry<K, V> implements MyEntryInterface<K, V> {
    K key;
    V value;

    public MyEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return this.key + "=" + this.value;
    }

    @Override
    public K getKey() {
        return key;
    }


    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V newValue) {
        V oldValue = this.value;
        this.value = newValue;
        return oldValue;
    }
}
