package _05_BT_DrawShapes;

import java.util.Scanner;

public class ShapesMenu {
    public static void main(String[] args) {
        int choice = -1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square");
        System.out.println("3. Print the square triangle");
        System.out.println("4. Exit");
        System.out.println("Your choice: ");
        choice = scanner.nextInt();
        int i;
        int j;

        while (choice != 4) {

            switch (choice) {
                case 1:
                    System.out.println("Enter width:");
                    int width = scanner.nextInt();
                    System.out.println("Enter height:");
                    int height = scanner.nextInt();
                    for (i = 1; i <= width; i++) {
                        for (j = 1; j <= height; j++) {
                            System.out.print("*  ");
                        }
                        System.out.print("\n");
                    }

                case 2:
                    System.out.println("Enter side:");
                    int side = scanner.nextInt();
                    for (i = 1; i <= side; i++) {
                        for (j = 1; j <= side; j++)
                            System.out.print("*  ");
                        System.out.print("\n");
                    }

                case 3:
                    System.out.println("Enter side");
                    side = scanner.nextInt();
                    for (i = 1; i <= side; i++) {
                        for (j = 1; j <= i; j++) {
                            System.out.print("*  ");
                        }
                        System.out.print("\n");
                    }

            }
        }
    }
}
