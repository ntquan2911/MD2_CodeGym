package _01_TH_ReverseArray;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 6;
        int[] myArray;

        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 6)
                System.out.println("Size is not exceed 6!");
        } while (size > 6);

        myArray = new int[size];
        int i = 0;
        while (i < myArray.length) {
            System.out.println("Enter element " + i + ": " );
            myArray[i] = scanner.nextInt();
            i++;
        }

        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j] + "\t");
        }

        for (int j = 0; j < myArray.length / 2; j++) {
            int temp = myArray[j];
            myArray[j] = myArray[size - 1 - j];
            myArray[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j] + "\t");
        }
    }
}
