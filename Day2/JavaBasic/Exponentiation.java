package Day2.JavaBasic;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        System.out.println("Output :" + result);
    }
}
