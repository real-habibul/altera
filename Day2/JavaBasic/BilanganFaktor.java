package Day2.JavaBasic;

import java.util.Scanner;

public class BilanganFaktor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        for (int i = 1; i <= angka; i++) {
            if (angka % i == 0) {
                System.out.println(i);
            }
        }
    }
}
