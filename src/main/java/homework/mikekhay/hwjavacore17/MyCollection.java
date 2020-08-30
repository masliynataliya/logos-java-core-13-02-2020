package homework.mikekhay.hwjavacore17;

public class MyCollection {

    private static Number[] numberArray;

    public MyCollection(Number[] numberArray) { MyCollection.numberArray= numberArray;
    }


    private  class Forward implements MyIterator{

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < numberArray.length;
        }

        @Override
        public Object next() {
            Number number = numberArray[currentIndex];
            if((int) number % 2 == 1){
                number = 0;
                currentIndex++;
            }
            else {
                currentIndex++;
            }
            return number;
        }
    }

    public Forward createForward(){
        return  new Forward();
    }





    private class Backward implements MyIterator{

        private int currentIndex = numberArray.length - 1;

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public Object next() {
            Number number = numberArray[currentIndex];
            if (currentIndex % 2 == 0) {
                currentIndex--;
                return number;
            }
            else {
                currentIndex--;
            }
            return "";
        }
    }

    public Backward createBackward(){
        return new Backward();
    }
}

