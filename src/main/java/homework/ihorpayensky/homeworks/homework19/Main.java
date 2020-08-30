package homework.ihorpayensky.homeworks.homework19;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String currentPath = "src\\main\\java\\homework\\ihorpayensky\\homeworks\\homework19\\text\\";

        System.out.println("\n === Task 1, 2 === ");

        Employee employee = new Employee("Scooby", 333000);
        System.out.println(employee.toString());


        File file1 = new File(currentPath + "hw19_Object.txt");

        Methods.Serializable(employee,file1);
        Employee deserializable = (Employee)Methods.Deserializable(file1);

        System.out.println("Deserializated obj: " + deserializable.toString());

        System.out.println("\n === Task 3 === ");
        System.out.println("Collection");

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("name1", 11));
        employeeList.add(new Employee("name2", 12));
        employeeList.add(new Employee("name3", 13));
        employeeList.add(new Employee("name4", 14));
        employeeList.add(new Employee("name5", 15));
        employeeList.add(new Employee("name6", 16));
        employeeList.add(new Employee("name7", 17));
        employeeList.forEach(x -> System.out.println(x.toString()));

        File file2 = new File(currentPath + "hw19_ArrayList.txt");

        Methods.Serializable(employeeList, file2);
        ArrayList<Employee> deserializableList = (ArrayList<Employee>) Methods.Deserializable(file2);

        System.out.println("\nDeserialized collection:");
        deserializableList.forEach(x -> System.out.println(x.toString()));
    }
}
