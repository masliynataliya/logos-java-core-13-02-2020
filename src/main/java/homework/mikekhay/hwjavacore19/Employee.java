package homework.mikekhay.hwjavacore19;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int id;
    private int salary;// коли полю salary задаємо transient то воно видає дефолтне значення типу даних яким воно позначене.

    public Employee() {
    }

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
