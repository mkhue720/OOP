import java.util.*;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> A = new HashSet<>();
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }
        Set<Integer> B = new HashSet<>();
        for (int i = 0; i < m; i++) {
            B.add(sc.nextInt());
        }
        A.retainAll(B);
        List<Integer> result = new ArrayList<>(A);
        Collections.sort(result);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
