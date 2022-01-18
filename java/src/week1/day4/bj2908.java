
import java.util.Scanner;
import java.lang.StringBuilder;

public class bj2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        StringBuffer sb1 = new StringBuffer(num1);
        StringBuffer sb2 = new StringBuffer(num2);
        num1 = sb1.reverse().toString();
        num2 = sb2.reverse().toString();
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        if(a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}
