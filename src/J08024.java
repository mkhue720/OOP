import java.util.*;

public class J08024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] array = new int[t];
        for (int i = 0; i < t; i++) {
            array[i] = sc.nextInt();
        }
        for (int n : array) {
            if (n == 0) {
                System.exit(1);
                continue;
            }

            Queue<Integer> Q = new LinkedList<>();
            Map<Integer, String> M = new HashMap<>();
            int initialMod9 = 9 % n;
            Q.add(initialMod9);
            M.put(initialMod9, "9");
            while (!Q.isEmpty()) {
                int u = Q.poll();
                int x = (u * 10 + 0) % n;
                if (!M.containsKey(x)) {
                    Q.add(x);
                    M.put(x, M.get(u) + "0");
                }
                int y = (u * 10 + 9) % n;
                if (!M.containsKey(y)) {
                    Q.add(y);
                    M.put(y, M.get(u) + "9");
                }
                if (M.containsKey(0)) {
                    break;
                }
            }
            if (!M.containsKey(0)) {
                System.out.println("No solution found");
            } else {
                String result = M.get(0);
                // Loại bỏ số '0' đứng đầu nếu có
                if (result.startsWith("0")) {
                    result = result.substring(1);
                }
                System.out.println(result);
            }
        }
    }
}
