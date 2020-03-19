package homework.didukhigor.homework.javacore6.salary;

public class FirstWorker implements Salary {

    private String name = "Santehnic";
    private double paymentPerHour = 12;
    private int workingHoursPerMonth = 176;

    public FirstWorker() {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
        this.workingHoursPerMonth = workingHoursPerMonth;
    }


    @Override
    public void salary() {
        System.out.println("Worker "+ name+ " receives " + paymentPerHour*workingHoursPerMonth + "$ per month. ");
    }
}
