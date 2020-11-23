package homework.ihorpayensky.homeworks.homework17;

class Collection {

    private Number[] numbers;

    public Collection(Number[] numbers) {
        this.numbers = numbers;
    }

    public Forward getForward() {
        return new Forward();
    }

    public Backward getBackward() {
        return new Backward();
    }

    private class Forward implements Iterator {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < numbers.length;
        }

        @Override
        public Object next() {
            if (numbers[currentIndex].intValue() % 2 != 0) {
                currentIndex++;
                return 0;
            }
            Number number = numbers[currentIndex];
            currentIndex++;
            return number;
        }
    }

    private class Backward implements Iterator {

        private int currentIndex = numbers.length-1;

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public Object next() {
            Number number = numbers[currentIndex];
            currentIndex = currentIndex-2;
            return number;
        }
    }

    public Iterator getIterator() {
        return new Iterator() {

            private int currentIndex = numbers.length-1;
            private int temp = 1;

            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }

            @Override
            public Object next() {
                if (numbers[currentIndex].intValue() % 2 != 0) {
                    Number number = numbers[currentIndex];
                    currentIndex = currentIndex - 3;
                    return number;
                }
                currentIndex = currentIndex - 3;
                return null;
            }
        };
    }

    public Iterator getTask4() {
        class PD implements Iterator {

            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < numbers.length;
            }

            @Override
            public Object next() {
                Number number = numbers[currentIndex];
                currentIndex = currentIndex + 5;
                return (int)number - 100;
            }
        }
        return new PD();
    }

    public static class Task5 {

        private Collection list;

        Task5 (Collection list) {
            this.list = list;
        }

        public Iterator getTask5() {
            return new Iterator() {
                private int currentIndex = 0;
                @Override
                public boolean hasNext() {
                    return list.numbers.length > currentIndex;
                }

                @Override
                public Object next() {
                    Integer integer = (Integer) list.numbers[currentIndex];
                    if (integer % 2 == 0)
                        integer++;
                    currentIndex = currentIndex + 2;
                    return integer;
                }
            };
        }
    }
}
