import java.util.Scanner;

public class Bai4 {
    public static int[] prime;

    public static void sieve() {
        prime = new int[1000001];
        for (int i=0; i<1000001; i++) prime[i] = 1;
        prime[0] = prime[1] = 0;
        for (int i=2; i<=Math.sqrt(1000001); i++) {
            if (prime[i] == 1) {
                for (int j=i*i; j<1000001; j+=i) {
                    prime[j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        sieve();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int idx = 0;
        int min = Math.abs(a[0]-x);
        for (int i=0; i<n; i++) {
            if (prime[a[i]]==1) {
                if (Math.abs(a[i]-x)<min) {
                    min = Math.abs(a[i]-x);
                    idx = i;
                }
            }
        }
        System.out.println("Vị trí của của số nguyên tố trên a có giá trị gần với X nhất: " + (idx+1));
    }
}
