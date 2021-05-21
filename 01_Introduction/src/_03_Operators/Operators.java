package _03_Operators;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        float height;
        float width;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height: ");
        height = scanner.nextFloat();
        System.out.println("Enter the width: ");
        width = scanner.nextFloat();

        float area = width * height;
        System.out.println("====> The area is: " + area);

    }
}
