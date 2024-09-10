import java.util.*;
public class J01026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = (int)Math.sqrt(a);
            if (b*b == a) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
