package StackLinkedListImpl;

public class MainFunction {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedStack linkedStack = new LinkedStack();

        linkedStack.push(janeJones);
        linkedStack.push(johnDoe);
        linkedStack.push(marySmith);
        linkedStack.push(mikeWilson);
        linkedStack.push(billEnd);

        linkedStack.printStack();

        System.out.println("=================");

        System.out.println(linkedStack.peek());

        System.out.println("=================");

        System.out.println(linkedStack.pop());

        System.out.println("=================");

        linkedStack.printStack();

        System.out.println("=================");

        System.out.println(linkedStack.isEmpty());

    }
}
