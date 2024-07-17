import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n*m];
        for (int i=0; i<n*m; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0; i<n*m-1; i++) {
            for (int j=i+1; j<n*m; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        int idx = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(a[idx++] + " ");
            }
            System.out.println();
        }
    }
}
