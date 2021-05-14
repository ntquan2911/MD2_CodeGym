package _09_BT_FindMax2dArray;

import java.util.Scanner;

public class FindMax2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int column;

        System.out.println("Enter row of array: ");
        row = scanner.nextInt();
        System.out.println("Enter column of array: ");
        column = scanner.nextInt();

        int[][] myArray = new int[row][column];
        int max = myArray[0][0];

        for (row = 0; row < myArray.length; row++) {
            for (column = 0; column < myArray.length; column++) {
                System.out.println("Enter elements of array: ");
                myArray[row][column] = scanner.nextInt();
                if (myArray[row][column] > max) {
                    max = myArray[row][column];
                }
            }
        }
        System.out.println("Max is " + max);
    }
}
