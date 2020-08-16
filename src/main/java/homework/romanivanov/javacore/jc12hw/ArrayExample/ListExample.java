package homework.romanivanov.javacore.jc12hw.ArrayExample;

public interface ListExample<E> {
    void add(E type);

    void remove(Object obj);

    void replace(Object obj, E newValue);
}
