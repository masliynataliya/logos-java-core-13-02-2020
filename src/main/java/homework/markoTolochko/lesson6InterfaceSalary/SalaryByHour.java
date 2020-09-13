package homework.markoTolochko.lesson6InterfaceSalary;

public class SalaryByHour implements Salary {

    int salaryByHour = 10;
    int hour = 10;
    @Override
    public void salary() {
        System.out.println("salary by hour " + salaryByHour * hour );

    }
}
