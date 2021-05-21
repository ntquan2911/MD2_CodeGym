package _06_BT_First20PrimeNumbers;

import java.util.Scanner;

public class First20PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, number, p, count, flag;

        System.out.println("Enter the number of prime terms you want!");
        number = sc.nextInt();
        System.out.println("First " + number + " prime numbers are : ");

        p = 2;
        i = 1;
        while (i <= number) {
            flag = 1;
            for (count = 2; count <= p - 1; count++) {
                if (p % count == 0)  //Will be true if p is not prime
                {
                    flag = 0;
                    break;      //Loop will terminate if p is not prime
                }
            }

            if (flag == 1) {
                System.out.print(p + " ");
                i++;
            }
            p++;
        }
    }
}
