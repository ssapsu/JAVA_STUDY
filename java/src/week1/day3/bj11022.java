package week1.day3;

import java.util.Scanner;

public class bj11022 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b, c;
        for (int i = 0; i < a; i++) {
            b = sc.nextInt();
            c = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n", i+1, b, c,b + c);
        }
    }
}
