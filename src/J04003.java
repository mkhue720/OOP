import java.util.*;

public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long originalA = a;
        long originalB = b;
        long x = a;
        long y = b;

        while (y != 0) {
            long tmp = y;
            y = x % y;
            x = tmp;
        }
        long gcd = x;
        long ts = originalA / gcd;
        long ms = originalB / gcd;
        System.out.println(ts + "/" + ms);

        sc.close();
    }
}
