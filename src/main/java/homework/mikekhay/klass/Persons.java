package homework.mikekhay.klass;
import java.util.ArrayList;
import java.util.List;

public class Persons {

    private String name;
    private int number;


    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Persons() {
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
