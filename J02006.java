import java.util.*;
public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            set.add(sc.nextInt());
        }
        for (int i : set) {
            System.out.print(i + " ");
        }
    }
}
