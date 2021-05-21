package _10_BT_CountStudent;

import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30 !");
        } while (size > 30);

        int[] array = new int[size];
        int count = 0;

        System.out.println("Input mark for students: ");

        for (int i = 0; i < array.length; i++) {
            array[i] =  scanner.nextInt();
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }
        System.out.println("The number of student passing exam is " + count);
    }
}
