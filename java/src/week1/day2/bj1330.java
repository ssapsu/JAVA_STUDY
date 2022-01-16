package week1.day2;

import java.util.Scanner;

public class bj1330 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        c = a - b;
        if (c == 0)
            System.out.printf("==");
        else if (c > 0)
            System.out.printf(">");
        else
            System.out.printf("<");
    }
}
