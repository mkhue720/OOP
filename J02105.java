import java.util.*;

public class J02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[n][n];
        List<List<Integer>> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ds.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            String[] ngang = sc.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(ngang[j]);
                if (matrix[i][j] == 1) {
                    ds.get(i).add(j + 1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("List(" + (i + 1) + ") = ");
            for (int j : ds.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
