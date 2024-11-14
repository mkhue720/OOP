import java.util.*;
public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            Set<String> set1 = new HashSet<>(Arrays.asList(s1.split(" ")));
            Set<String> set2 = new HashSet<>(Arrays.asList(s2.split(" ")));
            Set<String> res = new TreeSet<>();
            for (String s : set1) {
                if (!set2.contains(s)) {
                    res.add(s);
                }
            }
            for (String s : res) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
