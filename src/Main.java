public class Main {
    public static void main(String[] args) {
        String s = "Your account balance is Rs 98";

        if (s.matches("[0-9]")) {
            System.out.println(s);
        }
    }
}
