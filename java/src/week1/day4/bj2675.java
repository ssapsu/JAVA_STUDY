package week1.day4;

import java.util.Scanner;

public class bj2675 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        String c;
        for (int i = 0; i < a; i++) {
            b = sc.nextInt();
            c = sc.nextLine();
            for (int j = 1; j < c.length(); j++) {
                for (int k = 0; k < b; k++) {
                    System.out.printf("%c", c.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
