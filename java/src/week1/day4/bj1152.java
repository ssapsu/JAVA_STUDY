package week1.day4;

import java.util.Scanner;

public class bj1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        for (String arg : strArr) {
            if(!arg.equals(""))
                count ++;
        }
            System.out.printf("%d", count);
    }
}
