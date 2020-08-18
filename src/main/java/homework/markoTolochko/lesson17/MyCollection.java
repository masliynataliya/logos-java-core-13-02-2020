package homework.markoTolochko.lesson17;

public class MyCollection {
    private Number[] numberArray;

    public MyCollection(Number[] numberArray) {
        this.numberArray = numberArray;
    }
    private class Forward implements MyIterator{

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
    public Forward createForward(){
        return new Forward();
    }

}
