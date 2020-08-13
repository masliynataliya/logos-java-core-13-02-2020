package homework.ihorpayensky.homeworks.homework14.task1;

import java.util.Random;

class Cat implements Comparable<Cat>{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
        Random r = new Random();
        String[] nameList = {"Nina", "Mike", "Alice", "Tom", "Ray", "Jack", "Bob", "Nick", "Anne", "Pan", "Batman", "Superman"};

        this.name = nameList[r.nextInt(nameList.length-1)];
        this.age = r.nextInt(22-2+1)+2;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return this.name.compareTo(o.name);
    }

}
