package week1.day2;

import java.util.Scanner;

import java.util.Scanner;

public class bj2884 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b<45){
            b = 60 - (45-b);  
            if (a == 0) {
                a = 23;
            }
            else
                a -= 1;
        }
        else
            b -= 45;

        System.out.printf("%d %d", a,b);
    }
}