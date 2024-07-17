import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int[] cnt = new int[1000001];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }

        int maxElement = 0;
        int res = a[0];

        for (int i=0; i<1000001; i++) {
            if (cnt[i] != 0) {
                System.out.println(i + " xuất hiện " + cnt[i] + " lần");
            }
            if (cnt[i] > maxElement) {
                maxElement = cnt[i];
                res = i;
            }
        }
        System.out.print("Phần tử xuất hiện nhiều nhất: " + res);

    }
}
