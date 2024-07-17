import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int idx = 0;
        int max = 0;
        int i = 0;
        int cnt = 0;
        while (i < n-1) {
            if (a[i] < a[i+1]) {
                cnt++;
            } else {
                if (cnt > max) {
                    max = cnt;
                    idx = i - cnt + 1;
                    cnt = 0;
                }
            }
            i++;
        }
        System.out.println("Đường chạy dài nhất ở vị trí " + idx + " với độ dài là " + max);
    }
}
