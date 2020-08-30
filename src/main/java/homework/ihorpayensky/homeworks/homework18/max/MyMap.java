package homework.ihorpayensky.homeworks.homework18.max;

import java.util.*;

class MyMap<K,V> {

    private List<MyEntry<K,V>> entryList;

    public MyMap() {
        this.entryList = new ArrayList<>();
    }

    public void add(K key, V value) {
        for (MyEntry<K,V> e: entryList) {
            if (e.getKey().equals(key)) {
                throw new RuntimeException();
            }
        }
        entryList.add(new MyEntry<>(key, value));
    }

    public void removeByKey(K key) {
        entryList.removeIf(next -> next.getKey().equals(key));
    }
    public void removeByValue(V value) {
        entryList.removeIf(next -> next.getValue().equals(value));
    }

    public Set<K> keySet() {
        Set<K> temp = new HashSet<>();
        entryList.forEach(x -> temp.add(x.getKey()));
        return temp;
    }

    public List<V> values() {
        List<V> temp = new ArrayList<>();
        entryList.forEach(x -> temp.add(x.getValue()));
        return temp;
    }

    @Override
    public String toString() {
        String temp = "MyEntry {\n";
        for (MyEntry<K,V> e: entryList) {
            temp += "\t" + e.toString() + "\n";
        }
        temp += "}";
        return temp;
    }
}
