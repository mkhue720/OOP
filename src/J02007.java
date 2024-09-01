import java.util.*;
public class J02007 {
//    public static boolean isKQ(int n) {
//        if (n <= 1) return false;
//        if (n == 2) return true;
//        if (n % 2 == 0) return false;
//        for (int i = 3; i * i <= n; i += 2) {
//            if (n % i == 0) return false;
//        }
//        return true;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int m = sc.nextInt();
            int[] so = new int[m];
            int[] dem = new int[100001];
//            boolean[] isKQ = new boolean[100001];
            for (int j = 0; j < m; j++) {
                so[j] = sc.nextInt();
                if (so[j] < 100001 ) {
                    if (dem[so[j]] == 0) {
//                        isKQ[so[j]] = true;
                    }
                    dem[so[j]]++;
                }
            }
            System.out.println("Test " + i + ":");
            for (int j = 0; j < m; j++) {
                if (so[j] < 100001 && dem[so[j]] > 0) {
                    System.out.println(so[j] + " xuat hien " + dem[so[j]] + " lan");
                    dem[so[j]] = 0;
                }
            }
        }
    }
}
