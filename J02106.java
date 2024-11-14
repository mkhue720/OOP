import java.util.*;
public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[n][n];
        int dem = 0;
        for (int i = 0; i < n; i++) {
            String[] ngang = sc.nextLine().split(" ");
            int dem1 = 0;
            for (String gt : ngang) {
                if (gt.equals("1")) {
                    dem1++;
                }
            }
            if (dem1 > 1) {
                dem++;
            }
        }
        System.out.println(dem);
    }
}
