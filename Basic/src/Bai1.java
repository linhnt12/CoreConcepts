import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    // a
        int suma = 0;
        if (n%2 != 0) {
            for (int i=1; i<=n; i+=2) {
                suma += i;
            }
        } else {
            for (int i=2; i<=n; i+=2) {
                suma += i;
            }
        }
        System.out.println(suma);
    //

    // b
        double sumb = 0.0d;
        for (int i=1; i<=n; i++) {
            sumb += (1.0/i);
        }
        System.out.printf("%.2f", sumb);
    //
    }
}