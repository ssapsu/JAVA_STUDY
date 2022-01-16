package week1.day3;

import java.util.Scanner;

import java.util.Scanner;

public class bj10871 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        for (int i = 0; i < a; i++) {
            c = sc.nextInt();
            if(c<b)
                System.out.print(c+" ");
        }
    }
}