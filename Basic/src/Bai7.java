public class Bai7 {
    public static int[] prime;

    public static void sieve() {
        prime = new int [1000001];
        for (int i = 0; i<=1000000; i++) prime[i] = 1;
        prime[0] = prime[1] = 0;
        for (int i=2; i<=Math.sqrt(1000000); i++) {
            if (prime[i]==1) {
                for (int j=i*i; j<=1000000; j+=i) prime[j] = 0;
            }
        }
    }

    public static boolean check (int n) {
        while (n > 0) {
            if ((n % 10) % 2 == 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        sieve();
        for (int i=100000; i<=999999; i++) {
            if (prime[i] == 1) {
                if (check(i)==true)
                    System.out.println(i);
            }
        }
    }
}
