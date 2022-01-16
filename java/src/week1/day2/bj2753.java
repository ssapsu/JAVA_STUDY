package week1.day2;

import java.util.Scanner;

public class bj2753 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if((a%4==0)&&((a%100!=0)||(a%400==0)))
            System.out.printf("1");
        else
            System.out.printf("0");
    }
}
