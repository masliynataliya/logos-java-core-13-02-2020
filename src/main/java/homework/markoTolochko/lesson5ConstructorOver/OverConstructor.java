package homework.markoTolochko.lesson5ConstructorOver;

public class OverConstructor {
    String name;
    String lastName;

    public OverConstructor(String name) {
        this(name,"Putin");
        //this.name = name;

    }

    public OverConstructor(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "OverConstructor{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
