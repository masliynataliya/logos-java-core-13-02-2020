package homework.denysyerchenko.lesson06.salary;

public class HourlyWageWorkerImpl implements Salary {

    int hourlySalary = 20;
    int hoursPerMonth = 180;

    @Override
    public int getSalaryPerYear() {
        return (hourlySalary * hoursPerMonth * 12);
    }
}
