package homework.ihorpayensky.homework04.task3;

class Animal {
    private String name;
    private int age;
    private double speed;

    public Animal() {}
    public Animal(String name, int age, double speed) {
        this.name = name;
        this.age = age;
        this.speed = speed;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public double getSpeed() { return speed; }
    public void setSpeed(double speed) { this.speed = speed; }
}
