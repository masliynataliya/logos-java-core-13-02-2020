package homework.ihorpayensky.homeworks.homework05.task4;

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int phoneNumber;

    public Person() {}
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String fName, String lName, int age, int phoneNumber) {
        this(fName, lName);
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    public Person(String fName, String lName, int phoneNumber) {
        this(fName, lName);
        this.phoneNumber = phoneNumber;
    }


    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public int getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber; }




}
