import java.util.*;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Integer> emailCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine().trim().toLowerCase();
            String[] parts = name.split("\\s+");
            String lastName = parts[parts.length - 1];
            StringBuilder initials = new StringBuilder();
            for (int j = 0; j < parts.length - 1; j++) {
                initials.append(parts[j].charAt(0));
            }
            String email = lastName + initials + "@ptit.edu.vn";
            if (emailCount.containsKey(email)) {
                int count = emailCount.get(email) + 1;
                emailCount.put(email, count);
                email = lastName + initials + count + "@ptit.edu.vn";
            } else {
                emailCount.put(email, 1);
            }
            System.out.println(email);
        }
    }
}
