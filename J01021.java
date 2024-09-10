import java.util.Scanner;

public class J01021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] results = new long[20];
        int count = 0;
        final long MOD = 1000000007;
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a == 0 && b == 0) {
                break;
            }

            long result = 1;
            long base = a % MOD;

            while (b > 0) {
                if (b % 2 == 1) {
                    result = (result * base) % MOD;
                }
                base = (base * base) % MOD;
                b /= 2;
            }

            results[count] = result;
            count++;
        }
        sc.close();
        for (int i = 0; i < count; i++) {
            System.out.println(results[i]);
        }
    }
}
