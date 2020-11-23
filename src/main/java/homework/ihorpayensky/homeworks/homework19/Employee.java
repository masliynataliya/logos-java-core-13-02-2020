package homework.ihorpayensky.homeworks.homework19;

import java.io.Serializable;

class Employee implements Serializable {

    private int id;
    private static int maxId = 0;
    private String name;
    private transient int salary;

    public Employee() {
        this.id = maxId;
        maxId++;
    }
    public Employee(String name, int salary) {
        this.id = maxId;
        maxId++;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
