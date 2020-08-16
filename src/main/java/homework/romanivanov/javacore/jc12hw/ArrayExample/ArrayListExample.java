package homework.romanivanov.javacore.jc12hw.ArrayExample;

import java.util.Arrays;

public class ArrayListExample<E> implements ListExample<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] DEFAULT_ELEMENT = new Object[0];
    private Object[] elements;
    private int arrayElements;

    public ArrayListExample() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    ArrayListExample(int capacity) {
        if (capacity > 0) {
            this.elements = new Object[capacity];
        } else if (capacity == 0) {
            this.elements = DEFAULT_ELEMENT;
        } else throw new IllegalArgumentException("capacity can`t be less then 0");

    }

    @Override
    public String toString() {
        return "ArrayListExample: " +  Arrays.toString(elements);
    }

    private int newCapacity() {
        return elements.length * 2;
    }

    private void loadFactor() {
        for (Object element : elements) {
            if (element != null) {
                arrayElements++;
            }
        }
        if (isArrayFull()) {
            this.elements = Arrays.copyOf(elements, newCapacity());
        }
        arrayElements = 0;
    }

    private boolean isArrayFull() {
        return elements.length == arrayElements;
    }

    public int size() {
        return elements.length;
    }


    @Override
    public void add(E type) {
        loadFactor();
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                elements[i] = type;
                return;
            }
        }
    }

    @Override
    public void remove(Object obj) {
        replace(obj, null);
    }

    @Override
    public void replace(Object obj, E newValue) {
        for (int i = 0; i < elements.length; i++) {
            if (obj.equals(elements[i])) {
                elements[i] = newValue;
                return;
            }
        }

    }
}
