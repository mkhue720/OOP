import java.util.*;
public class J01007 {
    public  static boolean isFibo (long n) {
        long f[] = new long[93];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= 92; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for (int i = 0; i <=92; i++) {
            if (n == f[i]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int j = 0; j < a; j++) {
            long n = sc.nextLong();
            if (isFibo(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
