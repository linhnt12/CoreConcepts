public class Bai9 {
    // Kiểm tra nghịch đảo
    public static boolean rev (int n){
        String s = Integer.toString(n);
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }

    // Tính tổng chữ số
    public static int sum (int n) {
        int a = 0;
        while (n > 0) {
            a += n % 10;
            n /= 10;
        }
        return a;
    }

    // Kiểm tra chữ số
    public static boolean hasNumbers (int n) {
        String s = Integer.toString(n);
        for (int i=0; i<s.length(); i++) {
            if(s.charAt(i) !='6' && s.charAt(i) !='0' && s.charAt(i) !='8') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i=1000000; i<=999999999; i++) {
            if (hasNumbers(i) && rev(i) && sum(i) % 10 == 0) {
                System.out.println(i);
            }
        }
    }
}
