package homework.mikekhay.klass.test;

public class Employee {
    public String lastName;
    private int salary;

    public Employee(){
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee Last Name: " + lastName + "\n" + "Employee Salary: " + salary;
    }

}
