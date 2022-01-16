package week1.day2;

import java.util.Scanner;

public class bj14681 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>0)
            if(b>0)
                System.out.printf("1");
            else
                System.out.printf("4");
        else
            if(b>0)
                System.out.printf("2");
            else
                System.out.printf("3");
    }
}
