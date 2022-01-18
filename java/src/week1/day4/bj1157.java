package week1.day4;

import java.util.Scanner;

public class bj1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int[] arr = new int[26];
        int maxUsage,count = 0,location = 0;
        a = a.toUpperCase();
        for (int i = 0; i < a.length(); i++) {
            arr[(a.charAt(i) - 'A')]++;
        }
        sc.close();
        maxUsage = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxUsage < arr[i])
                maxUsage = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (maxUsage == arr[i])
            {
                count++;
                location = i;
            }
        }
        if(count>1)
            System.out.printf("?");
        else
            System.out.printf("%c",location+'A');
    }
}