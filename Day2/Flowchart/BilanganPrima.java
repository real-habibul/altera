package Day2.Flowchart;

import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int number = input.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " adalah bilangan prima");
        } else {
            System.out.println(number + " bukan bilangan prima");
        }
    }
}
