package lesson.example.java.core.lesson17.hwexample;

public class MyCollection {

    private Number[] numberArray;

    public MyCollection(Number[] numberArray) {
        this.numberArray = numberArray;
    }

    // внутрішній клас
    private class Forward implements MyIterator {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < numberArray.length;
        }

        @Override
        public Object next() {
            Number num = numberArray[currentIndex];
            currentIndex++;
            return num;
        }
    }

    // метод зовнішнього класу, який повертає екземпляр внутнішнього класу Forward
    public Forward createForward() {
        return new Forward();
    }

    // внутрішній клас
    private class Backward implements MyIterator {

        private int currentIndex = numberArray.length - 1;

        @Override
        public boolean hasNext() {
            return currentIndex  >= 0;
        }

        @Override
        public Object next() {
            Number num = numberArray[currentIndex];
            currentIndex--;
            return num;
        }
    }

    // метод зовнішнього класу, який повертає екземпляр внутнішнього класу Backward
    public Backward createBackward() {
        return new Backward();
    }
}
