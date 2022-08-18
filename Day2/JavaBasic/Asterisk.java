package Day2.JavaBasic;

import java.util.Scanner;

public class Asterisk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        int z = n;
        for (int i = 1;i<=n;i++){
            String result = "";
            for (int k = 0;k< z;k++){
                result+=" ";
            }

            for (int j = 0;j<i;j++){
                result+="* ";
            }

            System.out.println(result);
            z--;
        }
    }
}
