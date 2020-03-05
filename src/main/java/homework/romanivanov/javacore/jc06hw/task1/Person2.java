package homework.romanivanov.javacore.jc06hw.task1;

public class Person2 implements Salary {
    private double hoursOfDay;
    private double daysOfWork;

    @Override
    public void Salary(double hoursOfDay, double daysOfWork) {
        this.hoursOfDay = hoursOfDay;
        this.daysOfWork = daysOfWork;
        double money = (hoursOfDay  * daysOfWork) * 42;
        System.out.printf("\nПрацівник заробить %s гривень",  money);

    }





}
