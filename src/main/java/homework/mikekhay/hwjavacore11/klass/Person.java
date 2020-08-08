package homework.mikekhay.hwjavacore11.klass;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String number;


    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
