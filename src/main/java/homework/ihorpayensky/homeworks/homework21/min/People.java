package homework.ihorpayensky.homeworks.homework21.min;

import java.io.Serializable;

class People implements Serializable {

    @MyAnnotation(string = "name", serializable = true)
    private String name;

    @MyAnnotation(string = "$", serializable = false)
    private int salary;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public People(String name, int salary) {
        this.name = name;
        this.salary = salary;
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
}

