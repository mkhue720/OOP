import java.util.*;

public class J08015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long K = sc.nextLong();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int dem = 0;
            Map<Long, Long> map = new HashMap<>();

            for (int i = 0; i < N; i++) {
                long tmp = K - A[i];
                if (map.containsKey(tmp)) {
                    dem += map.get(tmp);
                }
                map.put(A[i], map.getOrDefault(A[i], 0L) + 1);
            }

            System.out.println(dem);
        }
    }
}
