import java.util.*;
public class J01014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0) {
            long a = sc.nextLong();
            long max = -1;
            while (a % 2 == 0) {
                max = 2;
                a /= 2;
            }
            for (long j = 3; j * j <= a; j+=2) {
                while (a % j == 0) {
                    max = j;
                    a /= j;
                }
            }
            if (a > 2) {
                max = a;
            }
            System.out.println(max);
        }
        sc.close();
    }
}
