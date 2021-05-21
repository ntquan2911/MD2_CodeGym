package _02_TH_FindElement;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (input.equals(students[i])) {
                System.out.println("Position of the students in the list " + input + " is: " + "[" + i + "]");
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found" + input + " in the list");
    }
}
