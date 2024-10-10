import java.util.*;

public class J02008 {
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static long lcm(long a, long b) {
        return (long) a * b / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while (T-- > 0) {
            long n = sc.nextLong();
            long S = 1;
            for (int i = 1; i <= n; i++) {
                S = lcm(S, i);
            }
            System.out.println(S);
        }
        sc.close();
    }
}
