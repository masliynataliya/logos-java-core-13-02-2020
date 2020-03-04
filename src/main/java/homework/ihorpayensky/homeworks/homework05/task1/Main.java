package homework.ihorpayensky.homeworks.homework05.task1;

class Main {
    public static void main(String[] args) {

        Pet[] pets = new Pet[] {
                new Cow(),
                new Cat(),
                new Dog()
        };

        for (var e: pets) {
            e.voice();
        }

    }
}
