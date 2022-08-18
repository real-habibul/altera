package Day2.JavaBasic;

import java.util.Scanner;

public class VokalKonsonan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();
        kalimat = kalimat.toLowerCase().replace(" ", "");
        int jumlahVokal = 0;
        int jumlahKonsonan = 0;
        int totalKarakter = kalimat.length();
        for (int i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);
            if (karakter == 'a' || karakter == 'i' || karakter == 'u' || karakter == 'e' || karakter == 'o') {
                jumlahVokal++;
            } else {
                jumlahKonsonan++;
            }

        }
        System.out.println("Jumlah Vokal : " + jumlahVokal);
        System.out.println("Jumlah Konsonan : " + jumlahKonsonan);
        System.out.println("Total Karakter : " + totalKarakter);
    }
}
