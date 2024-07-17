import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("Nhập số lớn hơn 0");
            n = sc.nextInt();
        }
        int cnt = 0;
        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                cnt ++;
            }
        }
        System.out.println("\n" + cnt);
    }
}
