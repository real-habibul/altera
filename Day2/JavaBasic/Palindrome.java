package Day2.JavaBasic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();
        kalimat = kalimat.toLowerCase();

        StringBuilder kalimatTerbalik = new StringBuilder(kalimat);
        System.out.println("Kalimat awal: " + kalimat);
        System.out.println("Kalimat terbalik: " + kalimatTerbalik.reverse());

        if (kalimat.equals(kalimatTerbalik.toString())) {
            System.out.println("Kalimat tersebut merupakan palindrome");
        } else {
            System.out.println("Kalimat tersebut bukan merupakan palindrome");
        }
    }
}
