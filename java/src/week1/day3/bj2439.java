package week1.day3;

import java.util.Scanner;

public class bj2439 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < a; j++) {
                if(a-j>i)
                    System.out.printf(" ");
                else
                    System.out.printf("*");
            }
            System.out.println();
        }
    }
}
