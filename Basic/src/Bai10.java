public class Bai10 {
    public static int[] prime;

    public static void sieve() {
        prime = new int[10000001];
        for (int i = 0; i <= 10000000; i++) prime[i] = 1;
        prime[0] = prime[1] = 0;
        for (int i = 2; i <= Math.sqrt(10000000); i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j <= 10000000; j += i) prime[j] = 0;
            }
        }
    }

    public static int rev (int n) {
        String s = Integer.toString(n);
        String res = "";
        for (int i=s.length()-1; i>=0; i--) {
            res += s.charAt(i);
        }
        return Integer.parseInt(res);
    }

    public static boolean isPrime(int n) {
        String s = Integer.toString(n);
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '4' || s.charAt(i) == '6' || s.charAt(i) == '8' || s.charAt(i) == '9') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        sieve();
        for (int i=1000000; i<=9999999; i++) {
            if (prime[i]==1 && prime[rev(i)]==1 && isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
