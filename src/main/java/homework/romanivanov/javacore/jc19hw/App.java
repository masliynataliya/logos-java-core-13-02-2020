package homework.romanivanov.javacore.jc19hw;

import homework.romanivanov.javacore.jc12hw.ArrayExample.ListExample;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee("Roma", 1, 200);
        File file = new File("TestFile.txt");
        Methods methods = new Methods();
        methods.serialize(file,employee);
//        employee = new Employee("Kek", 24,300);
        System.out.println();
        methods.deserialize(file);


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Joseph", 2,34));
        employees.add(new Employee("Hasanh",3,25));

        System.out.println();

        for (Employee employee1 : employees){
            methods.serialize(file,employee1);
            System.out.println();
            methods.deserialize(file);
            System.out.println();
        }








    }

}
