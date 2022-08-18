package Day2.JavaBasic;

import java.util.Scanner;

public class xo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();
        kalimat = kalimat.toLowerCase().replace(" ", "");
        int jumlahX = 0;
        int jumlahO = 0;

        // check if character x then add jumlahX +1 else add jumlahO +1
        for (int i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);
            if (karakter == 'x') {
                jumlahX++;
            } else {
                jumlahO++;
            }
        }
        if (jumlahX == jumlahO) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
