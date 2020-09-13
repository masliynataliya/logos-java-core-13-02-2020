package homework.markoTolochko.lesson6InterfaceSalary;

public class SalaryByMonth implements Salary {

    int salaryByDay = 110;
    int month = 22;

    @Override
    public void salary() {
        System.out.println("salary by month" + salaryByDay * month);

    }
}
