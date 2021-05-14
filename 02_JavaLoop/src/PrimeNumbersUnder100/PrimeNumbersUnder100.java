package PrimeNumbersUnder100;

public class PrimeNumbersUnder100 {
    public static void main(String[] args) {
        int number = 2;
        int count;
        while (number < 100) {
            count = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0)
                    count++;
            }
            if (count == 0 || number == 2)
                System.out.println(number);
            number++;
        }
    }
}
