package homework.didukhigor.homework.javacore6.salary;

public class FirstWorker implements Salary {

    private String name;
    private double paymentPerHour;
    private int workingHoursPerMonth;

    public FirstWorker() {
        this.name = "Santehnic ";
        this.paymentPerHour = 12;
        this.workingHoursPerMonth = 176;
    }


    @Override
    public void salary() {
        System.out.println("Worker "+ name+ " receives " + paymentPerHour*workingHoursPerMonth + "$ per month. ");
    }
}
