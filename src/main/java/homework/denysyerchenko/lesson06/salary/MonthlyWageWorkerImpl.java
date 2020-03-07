package homework.denysyerchenko.lesson06.salary;

public class MonthlyWageWorkerImpl implements Salary {

    int monthlySalary = 3500;


    @Override
    public int getSalaryPerYear() {
        return (monthlySalary * 12);
    }
}
