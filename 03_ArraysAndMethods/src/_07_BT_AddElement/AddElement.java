package _07_BT_AddElement;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, number, position, element;

        System.out.println("Enter the number of element: ");
        number = scanner.nextInt();
        int[] myArray = new int[number + 1];

        System.out.println("Enter the elements: ");
        for (i = 0; i < number; i++) {
            myArray[i] = scanner.nextInt();
        }

        System.out.println("Enter the position which is to be add: ");
        position = scanner.nextInt();
        System.out.println("Enter element which you want to add: ");
        element = scanner.nextInt();

        int[] newArray = new int[number + 1];

        for (i = position; i < newArray.length; i++) {
            newArray[i] = myArray[i];
        }

        System.out.println("After added, new array is: ");
        for (i = 0; i < newArray.length; i++) {
            System.out.println("newArray[" + i + "] = " + newArray[i]);
        }
    }
}
