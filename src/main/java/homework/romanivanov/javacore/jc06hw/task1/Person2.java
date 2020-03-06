package homework.romanivanov.javacore.jc06hw.task1;

import homework.pavliuk.MyWork.Person;

public class Person2 implements Salary {
    private double hoursOfWorking;
    private double taxes = 500;
    private double daysOfWorking;
    private final double salaryAtHour = 5000;

    public Person2(double hoursOfWorking, double daysOfWorking) {
        this.hoursOfWorking = hoursOfWorking;
        this.daysOfWorking = daysOfWorking;
    }



    public double getSalary() {
        return (salaryAtHour * hoursOfWorking ) - this.taxes * daysOfWorking ;
    }


    @Override
    public void salary(){
        System.out.println(getSalary());
    }
}


