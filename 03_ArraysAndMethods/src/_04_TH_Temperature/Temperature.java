package _04_TH_Temperature;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double C;
        double F;
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("0. Exit");
            System.out.println("Your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter F: ");
                    F = scanner.nextDouble();
                    System.out.println(F + "*F"  + " = " + FtoC(F) + "*C");
                    System.out.println("----------------------");
                    break;

                case 2:
                    System.out.println("Enter C: ");
                    C = scanner.nextDouble();
                    System.out.println(C + "*C " + " = " + CtoF(C) + "*F");
                    System.out.println("----------------------");
                    break;

                case 3:
                    System.exit(0);

            }
        } while (choice != 0);
    }

    public static double CtoF(double C) {
        double F = 1.8 * C + 32;
        return F;
    }

    public static double FtoC(double F) {
        double C = (F - 32) * 5 / 9;
        return C;
    }
}
