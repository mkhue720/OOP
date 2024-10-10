import java.util.Scanner;

public class J01022 {
    private static long[] lengths = new long[94];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lengths[1] = 1;
        lengths[2] = 1;
        for (int i = 3; i <= 93; i++) {
            lengths[i] = lengths[i - 2] + lengths[i - 1];
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            long K = sc.nextLong();
            System.out.println(findKthChar(N, K));
        }
        sc.close();
    }
    public static char findKthChar(int N, long K) {
        if (N == 1) return '0';
        if (N == 2) return '1';
        if (K <= lengths[N - 2]) {
            return findKthChar(N - 2, K);
        } else {
            return findKthChar(N - 1, K - lengths[N - 2]);
        }
    }
}
