package week1.day3;

import java.util.Scanner;

public class bj1110 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int givenNum, a, b, c,count = 0;
        givenNum = sc.nextInt();
        a = givenNum;
        do{
            if (a < 10) {
                b = a;
                c = a;
            }
            b = a % 10;
            c = (b + a / 10) % 10;
            a = b * 10 + c;
            count ++;
        } while (a != givenNum);
        System.out.print(count);
    }
}
