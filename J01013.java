//TLE
import java.util.*;

public class J01013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt();
            int S = 0;
            int sqr = (int) Math.sqrt(n);
            for (int j = 2; j <= sqr; j++) {
                if (n % j == 0) {
                    while (n % j == 0) {
                        S += j;
                        n /= j;
                    }
                    sqr = (int) Math.sqrt(n);
                }
            }
            if (n > 1) {
                S += n;
            }
            sum += S;
        }
        System.out.println(sum);
        sc.close();
    }
}
