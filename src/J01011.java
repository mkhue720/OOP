import java.util.*;

public class J01011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 100 || n < 1) {
            System.exit(1);
        } else {
            long[] lcmResults = new long[n];
            long[] gcdResults = new long[n];

            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long originalA = a;
                long originalB = b;
                while (a != b) {
                    if (a > b) {
                        a = a - b;
                    } else {
                        b = b - a;
                    }
                }
                long gcd = a;
                long lcm = (originalA / gcd) * originalB;
                lcmResults[i] = lcm;
                gcdResults[i] = gcd;
            }
            for (int i = 0; i < n; i++) {
                System.out.println(lcmResults[i] + " " + gcdResults[i]);
            }
        }

        sc.close();
    }
}
