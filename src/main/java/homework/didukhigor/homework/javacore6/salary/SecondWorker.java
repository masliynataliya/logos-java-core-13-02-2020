package homework.didukhigor.homework.javacore6.salary;

public class SecondWorker implements Salary {

    private String name;
    private double salaryForTheMonth;

    public SecondWorker() {
        this.name = "Doctor";
        this.salaryForTheMonth = 2237.3445;
    }

    @Override
    public void salary() {
        System.out.println("Worker "+ name+ " receives " + salaryForTheMonth + "$ per month. ");

    }
}
