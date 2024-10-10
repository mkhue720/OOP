package J04008;
import java.util.*;
public class J04008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        while (z-- >0) {
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
                System.out.printf("%.3f\n", m + n + p);
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
