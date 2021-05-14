package _04_BT_Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan (3,10, "blue", true);
        Fan fan2 = new Fan (2, 5, "blue",false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
