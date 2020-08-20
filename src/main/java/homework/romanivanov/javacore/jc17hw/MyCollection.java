package homework.romanivanov.javacore.jc17hw;

public class MyCollection {
    private static Number[] numbers;

    public MyCollection(Number[] numbers) {
        MyCollection.numbers = numbers;
    }
    //Внутрішній клас
    private class FirstNestedClass implements MyIterator {

        private int currentIndex = 0;
        @Override
        public boolean hasNext() {
            return currentIndex < numbers.length;
        }

        @Override
        public Object next() {
            Number num = numbers[currentIndex];
            if ((int) num % 2 == 1) {
                num = 0;
                currentIndex++;
            } else {
                currentIndex++;
            }
            return num;
        }
    }

    //метод зовнішнього класу
    public FirstNestedClass createForward() {
        return new FirstNestedClass();
    }
    //Внутрішній клас
    private class SecondNestedClass implements MyIterator {
        private int currentIndex = numbers.length - 1;

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public Object next() {
            Number num = numbers[currentIndex];
            if (currentIndex % 2 == 0) {
                currentIndex--;
                return num;
            } else {
                currentIndex--;
            }
            return "";
        }
    }

    public SecondNestedClass createBackward() {
        return new SecondNestedClass();
    }

    //локальний клас
    public MyIterator example() {
        class LocalClassExample implements MyIterator {
            private int currentIndex = 0;
            private int j = 4;

            @Override

            public boolean hasNext() {
                return currentIndex < numbers.length;
            }

            @Override
            public Object next() {
                Number n = numbers[currentIndex];
                if (currentIndex == j) {
                    j = j + 5;
                    if ((int) n % 2 == 0) {
                        n = (int) n - 100;
                        currentIndex++;
                        return n;

                    } else
                        currentIndex++;
                } else {
                    currentIndex++;
                }

                return "";
            }
        }
        return new LocalClassExample();
    }

    //анонімний клас
    public MyIterator anonim() {
        return new MyIterator() {
            private int currentIndex = numbers.length - 1;
            private  int number = numbers.length - 3;

            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }

            @Override
            public Object next() {
                Number n = numbers[currentIndex];
                if (currentIndex == number) {
                    number = number - 3;
                    if ((int) n % 2 == 1) {
                        currentIndex--;
                        return n;
                    }else currentIndex--;
                } else {
                    currentIndex--;
                }
                return "";
            }
        };

    }

//статичний клас
    static class StaticClassExample implements MyIterator {
        static int currentIndex = 0;
        static int j = 1;

        @Override
        public boolean hasNext() {
            return currentIndex < numbers.length;
        }

        @Override
        public Object next() {
            Number n = numbers[currentIndex];
            if (currentIndex == j) {
                j = j + 2;
                if ((int) n % 2 == 0) {
                    n = (int) n - 1;
                    currentIndex++;
                    return n;
                } else currentIndex++;
            } else currentIndex++;
            return "";
        }
    }
    public StaticClassExample createStatic() {
        return new StaticClassExample();
    }






}
