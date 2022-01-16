package week1.day2;

import java.util.Scanner;

public class bj9498 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(90 <= a && a <= 100)
            System.out.printf("A");
        else if(80 <= a && a <= 89)
            System.out.printf("B");
        else if(70 <= a && a <= 79)
            System.out.printf("C");
        else if(60 <= a && a <= 69)
            System.out.printf("D");
        else
            System.out.printf("F");
    }
}
