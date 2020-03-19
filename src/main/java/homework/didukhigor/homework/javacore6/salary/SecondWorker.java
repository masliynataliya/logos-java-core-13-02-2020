package homework.didukhigor.homework.javacore6.salary;

public class SecondWorker implements Salary {

    private String name = "Doctor";
    private double salaryForTheMonth = 2237.3445;


    public SecondWorker() {
        this.name = name;
        this.salaryForTheMonth = salaryForTheMonth;
    }

    @Override
    public void salary() {
        System.out.println("Worker "+ name+ " receives " + salaryForTheMonth + "$ per month. ");

    }
}
