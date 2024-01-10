import java.util.Scanner;

public class Two {
    public static void main(String args[]) {
        for (int i = 1; i <= 11; i++) {
            for (int j = i + 1; j <= 11; j++) {
                int x = i;
                int y = j;
                int t, gcd, lcm;
                while (y != 0) {
                    t = y;
                    y = x % y;
                    x = t;
                }
                gcd = x;
                lcm = (i * j) / gcd;

                System.out.println("GCD of " + i + " and " + j + " is " + gcd);
                System.out.println("LCM of " + i + " and " + j + " is " + lcm);
            }
        }
    }
}
