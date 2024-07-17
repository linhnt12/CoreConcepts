import java.util.Scanner;

public class Bai8 {
    public static boolean check (int n){
        String s = Integer.toString(n);
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }

    public static int sum (int n) {
        int a = 0;
        while (n > 0) {
            a += n % 10;
            n /= 10;
        }
        return a;
    }

    public static void main(String[] args) {
        // a
        System.out.println("Số thuận nghịch có sáu chữ số");
        for (int i=100000; i<=999999; i++) {
            if (check(i)) System.out.print(i + " ");
        }
        // b
        System.out.println("\nSố thuận nghịch có sáu chữ số mà tổng chữ số chia hết cho 10");
        for (int i=100000; i<=999999; i++) {
            if (check(i) && sum(i) %10 == 0) System.out.print(i + " ");
        }
    }
}
