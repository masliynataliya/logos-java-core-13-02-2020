package homework.denysyerchenko.lesson06.salary;

import homework.denysyerchenko.lesson06.salary.HourlyWageWorkerImpl;
import homework.denysyerchenko.lesson06.salary.MonthlyWageWorkerImpl;

public class SalaryApplication {
    public static void main(String[] args) {
        HourlyWageWorkerImpl worker1 = new HourlyWageWorkerImpl();
        MonthlyWageWorkerImpl worker2 = new MonthlyWageWorkerImpl();

        System.out.println("The hourly wage worker salary per year = " + worker1.getSalaryPerYear());
        System.out.println("The monthly wage worker salary per year = " + worker2.getSalaryPerYear());
    }
}
