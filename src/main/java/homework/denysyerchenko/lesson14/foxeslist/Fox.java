package homework.denysyerchenko.lesson14.foxeslist;

public class Fox implements Comparable<Fox> {
    private String name;
    private int age;

    public Fox(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Foxes{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Fox f) {
        return name.compareTo(f.getName());
    }
}
