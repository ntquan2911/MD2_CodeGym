package _07_BMI;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double weight;
        double height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        weight = scanner.nextDouble();
        System.out.println("Enter your height");
        height = scanner.nextDouble();

        double bmi = weight / Math.pow(height, 2);

        if (bmi < 18.5) {
            System.out.println("\n =======> BMI = " + bmi +" , Underweight!");
        }
        else if (bmi < 25) {
            System.out.println("\n =======> BMI = " + bmi +" , Normal!");
        }
        else if (bmi < 30) {
            System.out.println("\n =======> BMI = " + bmi +" , Overweight!");
        }
        else
            System.out.println("\n =======> BMI = " + bmi +" , Obese!");
    }
}
