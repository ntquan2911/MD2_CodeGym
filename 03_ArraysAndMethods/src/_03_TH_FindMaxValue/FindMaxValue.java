package _03_TH_FindMaxValue;

import java.util.Scanner;

public class FindMaxValue {
    public static void main(String[] args) {
        int size;
        int[] myArray;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 5)
                System.out.println("Size should not exceed 5");
        } while (size > 5);

        myArray = new int[size];
        int i = 0;
        while (i < myArray.length) {
            System.out.println("Enter element" + (i + 1) + " : ");
            myArray[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Property list: ");
        for (int j = 0; j < myArray.length; j++) {
            System.out.println(myArray[j] + "\t");
        }

        int max = myArray[0];
        int index = 1;
        for (int j = 0; j < myArray.length; j++) {
            if (myArray[j] > max) {
                max = myArray[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + ", at position " + index);
    }
}
