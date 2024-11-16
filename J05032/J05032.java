package J05032;
import java.util.*;
public class J05032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<Nguoi> persons = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            String dob = input[1];
            persons.add(new Nguoi(name, dob));
        }
        persons.sort(Comparator.comparing(Nguoi::getDateOfBirth));
        System.out.println(persons.get(persons.size() - 1).getName());
        System.out.println(persons.get(0).getName());
    }
}
