// đã chạy được bị TLE
import java.util.*;
public class J01014 {
    public static long isKQ(long n) {
        long max = -1;
        while (n % 2 == 0) {
            max = 2;
            n /= 2;
        }
        for (int i = 3; i * i <= n; i+=2) {
            while (n % i == 0) {
                max = i;
                n /= i;
            }
        }
        if (n > 2) {
            max = n;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] results = new long[n];
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            results[i] = isKQ(a);
        }
        sc.close();
        for (long a : results) {
            System.out.println(a);
        }
    }
}
