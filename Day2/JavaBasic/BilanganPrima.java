package Day2.JavaBasic;

import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Input = ");
        int number = input.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Bilangan Prima");
        } else {
            System.out.println("Bukan Bilangan Prima");
        }
    }
}
