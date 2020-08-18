package homework.romanivanov.javacore.jc14hw.Cat;

import java.util.Objects;

public class Cat implements Comparable<Cat> {
    private int age;
    private String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Cat setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

//    @Override
//    public int compare(Cat cat1, Cat cat2) {
//        int age1 = cat1.getAge();
//        int age2 = cat2.getAge();
//        String name1  = cat1.getName();
//        String name2 = cat2.getName();
//        if(age1 > age2){
//            return 1;
//        }
//        if (age1 < age2){
//            return -1;
//        }else {
//            if(name1.compareTo(name2) !=0){
//                return name1.compareTo(name2);
//            }else return 0;
//        }
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        int age1 = this.getAge();
        int age2 = cat.getAge();
        String name1  = this.getName();
        String name2 = cat.getName();
        if(age1 > age2){
            return 1;
        }
        if (age1 < age2){
            return -1;
        }else {
            if(name1.compareTo(name2) !=0){
                return name1.compareTo(name2);
            }else return 0;
        }
    }
}
