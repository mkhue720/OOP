import java.util.*;
public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int dem = 0;
            for (int j = 1; j * j <= a; j++) {
                if (a % j == 0) {
                    if (j % 2 == 0) {
                        dem += 1;
                    }
                    if (j != a / j && (a / j) % 2 == 0) {
                        dem += 1;
                    }
                }
            }
            System.out.println(dem);
        }
    }
}
