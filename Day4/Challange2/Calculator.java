package Day4.Challange2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        runCalculator();
    }

    private static void runCalculator() {
        Scanner input = new Scanner(System.in);
        System.out.println("+++++++ Calculator +++++++");
        System.out.println("1.\tOpen Calculator");
        System.out.println("99.\tExit");
        System.out.print("Masukkan pilihan anda: ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                runOperation();
                break;
            case 99:
                System.out.println("Thank you for using our calculator");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }
    }

    private static void runOperation() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n+++++++ Calculator +++++++");
//        MathContext precision = new MathContext(3);
        System.out.print("Masukkan Value 1: ");
        BigDecimal value1 = input.nextBigDecimal();
        System.out.print("Masukkan Value 2: ");
        BigDecimal value2 = input.nextBigDecimal();

        System.out.println("\n+++++++ Calculator +++++++");
        System.out.println("Please Enter Calculation Operation");
        System.out.println("1.\tAdd Value");
        System.out.println("2.\tSub Value");
        System.out.println("3.\tMultiply Value");
        System.out.println("4.\tDivide Value");
        System.out.println("\n+++++++ Calculator +++++++");
        System.out.print("Pilihan anda: ");
        int operation = input.nextInt();

        if (operation == 1) {
            System.out.println("Hasil: " + value1.add(value2));
        } else if (operation == 2) {
            System.out.println("Hasil: " + value1.subtract(value2));
        } else if (operation == 3) {
            System.out.println("Hasil: " + value1.multiply(value2));
        } else if (operation == 4) {
            System.out.println("Hasil: " + value1.divide(value2, 3, RoundingMode.HALF_UP));
        } else {
            System.out.println("Pilihan anda tidak tersedia");
        }

        //give option to user to continue or not
        System.out.println("\n+++++++ Calculator +++++++");
        System.out.println("1.\tContinue");
        System.out.println("2.\tExit");
        System.out.print("Pilihan anda: ");
        int pilihan2 = input.nextInt();
        if (pilihan2 == 1) {
            runOperation();
        } else {
            System.out.println("Thank you for using our calculator");
        }
    }
}
