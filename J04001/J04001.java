package J04001;
import java.util.*;
public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- >0) {
            Point[] p = new Point[2];
            for (int i = 0; i < 2; i++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                p[i] = new Point(x, y);
            }
            double a = p[0].distance(p[1]);
            System.out.printf("%.4f\n", a);
        }
    }
}
