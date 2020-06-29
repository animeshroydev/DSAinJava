package Lists.Vector;

// Vector is thread safe. (Synchronized)
// ArrayList isn't thread safe.
// It is recommended to use ArrayList if we don't want thread safety. (Not Synchronized)

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "John", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Marry", "Smith", 22));

        for (Employee e: employeeList) {
            System.out.println(e);
        }
    }
}