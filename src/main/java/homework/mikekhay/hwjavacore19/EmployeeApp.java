package homework.mikekhay.hwjavacore19;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class EmployeeApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee("Mike",1001,5500);
        File file = new File("src/main/java/homework/mikekhay/hwjavacore19.txt");
        Methods methods = new Methods();
        methods.serialize(file,employee);
        methods.deserealize(file);
        System.out.println();

        List<Employee> emp = new LinkedList<>();
        emp.add(new Employee("Taras",1002,5000));
        emp.add(new Employee("Oleg",1008,4400));
        emp.add(new Employee("Igor",1005,4800));
        emp.add(new Employee("Christina",1009,5800));
        emp.add(new Employee("Nazar",1004,4500));

        for (Employee e: emp) {
            methods.serialize(file,e);
            methods.deserealize(file);
        }

    }
}
