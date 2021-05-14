package _06_BT_DeleteElement;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, number, position;

        System.out.println("Enter the number of elements: ");
        number = scanner.nextInt();
        int[] myArray = new int[number];

        System.out.println(myArray.length);

        System.out.println("Enter the elements: ");
        for (i = 0; i < number; i++) {
            myArray[i] = scanner.nextInt();
            System.out.println(i);
        }
        System.out.println(myArray.length);

        System.out.println("Enter the position which is to be remove: ");
        position = scanner.nextInt();
        for (i = position; i < number - 1; i++) {
            myArray[i] = myArray[i + 1];
        }
        number = number - 1;

        System.out.println("After removed, new array is: ");
        for (i = 0; i < number; i++) {
            System.out.println("myArray[" + i + "] = " + myArray[i]);
        }

        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);
    }
}
