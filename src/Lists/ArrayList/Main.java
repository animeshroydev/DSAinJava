package Lists.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "John", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Marry", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

//        for (Employee e: employeeList) {
//            System.out.println(e);
//        }
//
//        System.out.println("**************************");
//
//        System.out.println(employeeList.get(1));
//        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("John", "Adam", 4568));

        for (Employee e: employeeList) {
            System.out.println(e);
        }

        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("John", "Doe", 4567));

        for (Employee e: employeeList) {
            System.out.println(e);
        }

        System.out.println("**********");

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee e: employeeArray) {
            System.out.println(e);
        }

        System.out.println("**********");

        System.out.println(employeeList.contains(new Employee("Marry", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        employeeList.remove(2);

        for (Employee e: employeeList) {
            System.out.println(e);
        }
    }
}
