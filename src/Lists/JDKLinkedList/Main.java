package Lists.JDKLinkedList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "John", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marrySmith = new Employee("Marry", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones); // added in HEAD/first
        list.addFirst(johnDoe);
        list.addFirst(marrySmith);
        list.addFirst(mikeWilson);

        System.out.print("HEAD -> ");
        for (Employee employee : list) {
            System.out.print(employee);
            System.out.print(" <=> ");
        }
        System.out.println("null");

        list.addLast(billEnd); // added in tail/last
        // list.add(billEnd); // does same

        System.out.print("HEAD -> ");
        for (Employee employee : list) {
            System.out.print(employee);
            System.out.print(" <=> ");
        }
        System.out.println("null");


        list.removeFirst();
        System.out.print("HEAD -> ");
        for (Employee employee : list) {
            System.out.print(employee);
            System.out.print(" <=> ");
        }
        System.out.println("null");


        list.removeLast();
        System.out.print("HEAD -> ");
        for (Employee employee : list) {
            System.out.print(employee);
            System.out.print(" <=> ");
        }
        System.out.println("null");
    }
}
