package homework.mikekhay.klass.test;
    
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class EmployeeList extends Employee{

        private List <Employee> employee =  new ArrayList<Employee>();


        public EmployeeList(Employee person) {
            employee.add(person);
        }

        public static void add(Employee employee) {
        }

        public void DisplayEmployees(){
            System.out.println("Employee:"  + employee.size());
            displayList(employee);
        }

        public static void displayList(List employee) {

        }
    }
    
