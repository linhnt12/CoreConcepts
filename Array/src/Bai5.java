import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập mảng a
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        // Nhập mảng b
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i=0; i<m; i++) {
            b[i] = sc.nextInt();
        }

        int p = sc.nextInt();
        int[] c = new int[m+n];
        for (int i=0; i<p; i++) {
            c[i]=a[i];
        }

        for (int i=p; i<p+m; i++) {
            c[i] = b[i-p];
        }

        for (int i=p+m; i<m+n; i++) {
            c[i] = a[p++];
        }

        for (int i=0; i<m+n; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
