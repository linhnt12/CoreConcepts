import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n + " = ");
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    if (n/i != 1) System.out.print(i + " x ");
                    else System.out.println(i);
                    n /= i;
                }
            }
        }
        if (n > 1) {
            System.out.println(n);
        }
    }
}
