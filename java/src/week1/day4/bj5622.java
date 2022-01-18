package week1.day4;

import java.util.Scanner;

public class bj5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
        String str = sc.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 8; j++) {
                if (strArr[j].contains(Character.toString(str.charAt(i))))
                    count += j + 3;
            }
        }
        System.out.printf("%d",count);
    }
}
