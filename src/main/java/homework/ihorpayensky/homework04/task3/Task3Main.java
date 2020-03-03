package homework.ihorpayensky.homework04.task3;

class Task3Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Кіт", 4, 15);

        System.out.println(" ---------------------------------------------------");
        System.out.println("Назва тварини:\t" + animal.getName() + "\nВік тварини:\t"
                + animal.getAge() + "\nШвидкість тварини:\t" + animal.getSpeed() +
                "\n ---------------------------------------------------");

        animal.setName("Собака");
        animal.setAge(5);
        animal.setSpeed(20);

        System.out.println("Назва тварини:\t" + animal.getName() + "\nВік тварини:\t"
                + animal.getAge() + "\nШвидкість тварини:\t" + animal.getSpeed() +
                "\n ---------------------------------------------------");
    }
}
