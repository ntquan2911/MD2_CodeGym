package UCLN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter num1: ");
        num1 = input.nextInt();
        num1 = Math.abs(num1);

        System.out.println("Enter num2: ");
        num2 = input.nextInt();
        num2 = Math.abs(num2);

        if (num1 == 0 || num2 == 0) {
            System.out.println("No greatest common factor");
        }
        while (num1 != num2) {
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
    }
}
