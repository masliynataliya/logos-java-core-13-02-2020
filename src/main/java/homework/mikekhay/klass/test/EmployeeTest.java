package homework.mikekhay.klass.test;
import java.util.ArrayList;
import java.util.Scanner;



public class EmployeeTest {
    static ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            addEmployees(employeeList);
        }
        System.out.println(employeeList.toArray());

    }

    public static void addEmployees(ArrayList<Employee> employeeList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0: quit, 1: add, 2: display");
        String options = scanner.next();
        if (options.equals("1")) {

            System.out.print("Enter employee last name: ");
            String lastname = scanner.next();

            System.out.print("Enter Employee Salary: " + "£");
            int salary = scanner.nextInt();

            Employee employee = new Employee();
            EmployeeList.add(employee);
        } else if (options.equals("2")) {
            for (Employee employee : employeeList) {
                System.out.println("Name: " + employee.getLastName() +  ", " + "Salary: " + employee.getSalary());
                System.out.println(employee);
            }
        } else {
            System.exit(0);
        }


    }
}
