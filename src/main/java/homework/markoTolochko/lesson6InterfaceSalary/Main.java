package homework.markoTolochko.lesson6InterfaceSalary;

public class Main {
    public static void main(String[] args) {
        Salary salary = new SalaryByHour();
        salary.salary();
        Salary salary1 = new SalaryByMonth();
        salary1.salary();
    }
}
