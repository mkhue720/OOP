//WA
package J04009;
import java.util.*;
import static java.lang.Math.sqrt;

public class J04009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        while (z-- > 0) {
            Point[] a = new Point[3];
            for (int i = 0; i < 3; i++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                a[i] = new Point(x, y);
            }
            double m = a[0].distance(a[1]);
            double n = a[0].distance(a[2]);
            double p = a[1].distance(a[2]);
            if (m + n > p && m + p > n && n + p > m) {
                double area = sqrt((m + n + p) * (m + n - p) * (n + p  - m) * (m + n - p)) / 4;
                System.out.printf("%.2f\n", area);
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
