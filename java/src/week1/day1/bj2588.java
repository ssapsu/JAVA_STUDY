package week1.day1;

import java.util.Scanner;

import java.util.Scanner;

public class bj2588 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((b%10)*a);
        System.out.println((b/10%10)*a);
        System.out.println(b/100*a);
        System.out.println(a*b);
    }
}
