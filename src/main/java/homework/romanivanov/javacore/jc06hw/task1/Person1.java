package homework.romanivanov.javacore.jc06hw.task1;

public class Person1  implements Salary{
    private double hoursOfWorking;
    private double taxes = 500;
    private double daysOfWorking;
    private final double salaryAtMonth = 1000000;

    public Person1(double hoursOfWorking, double daysOfWorking) {
        this.hoursOfWorking = hoursOfWorking;
        this.daysOfWorking = daysOfWorking;
    }


    @Override
    public double getSalary() {
        return (salaryAtMonth * hoursOfWorking ) - this.taxes * daysOfWorking ;
    }

    public void salary(){
        System.out.println(getSalary());
    }
}
