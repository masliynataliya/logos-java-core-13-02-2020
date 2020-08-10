package homework.markoTolochko.phoneBook;

public class Person {
    private Integer phoneNumber;
    private String name;

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PhoneNumber: " + phoneNumber + " Name: " + name;

    }
}
