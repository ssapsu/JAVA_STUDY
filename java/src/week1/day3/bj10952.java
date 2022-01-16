package week1.day3;

import java.util.Scanner;

public class bj10952 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a, b;
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 && b == 0)
                break;
            System.out.println(a+b);
        }
    }
}