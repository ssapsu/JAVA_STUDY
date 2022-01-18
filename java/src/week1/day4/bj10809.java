package week1.day4;

import java.util.Scanner;

public class bj10809 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int arr[] = new int[26] ;
        int dist ;
        for (int i = 0; i < 26; i++) {
            dist = (int) (a.indexOf('a'+i));
            arr[i] = dist;
        }
        for (int b : arr) {
            System.out.print(b+" ");
        }
    }
}
