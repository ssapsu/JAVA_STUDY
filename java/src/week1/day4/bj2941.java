package week1.day4;

import java.util.Scanner;

public class bj2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        String str = sc.next();
        for (int i = 0; i < strArr.length; i++) {
            if(str.contains(strArr[i]))
                str = str.replace(strArr[i], "!");
        }
        System.out.printf("%d",str.length());
    }
}
