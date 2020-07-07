package Lists.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "John", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marrySmith = new Employee("Marry", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marrySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.isEmpty());

        System.out.println(list.getSize());

        list.printList();

        System.out.println("--------- REMOVE ----------");

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

    }
}

