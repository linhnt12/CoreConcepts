import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Tổng các phần tử đường chéo chính
        int sumChinh = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i == j) sumChinh += a[i][j];
            }
        }
        System.out.println("Tổng các phần tử theo đường chéo chính: " + sumChinh);
        // Tổng các phần tử đường chéo phụ
        int sumPhu = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i == n-j-1) sumPhu += a[i][j];
            }
        }
        System.out.println("Tổng các phần tử theo đường chéo phụ: " + sumPhu);
    }
}
