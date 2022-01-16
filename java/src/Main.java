import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int[] arr = new int[26];
        int maxUsage;
        a = a.toUpperCase();
        for (int i = 0; i < a.length(); i++) {
            arr[(a.indexOf(i)-'A')]++;
        }
        maxUsage = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxUsage < arr[i])
                maxUsage = arr[i];
            if (i + 1 == arr.length) {
                if (maxUsage == arr[i])
                    System.out.printf("?");
                else
                    System.out.printf("%c", 'A');
            }
        }
        sc.close();
    }
}