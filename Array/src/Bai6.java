import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }

        int idx = 0;
        for (int i=0; i<n-1; i++) {
            if (a[i] <= x && a[i+1] >= x) {
                idx = i+1;
                break;
            }
        }

        int[] b = new int[n+1];
        for (int i=0; i<idx; i++) b[i] = a[i];
        b[idx] = x;
        for (int i=idx+1; i<n+1; i++) b[i] = a[idx++];

        for (int i=0; i<n+1; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
