import java.util.*;
import java.io.*;
class Subject {
    private String code;
    private String name;
    private int credits;
    public Subject(String code, String name, int credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
    }
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + credits;
    }
}

public class J07034 {
    public static void main(String[] args) {
        List<Subject> subjects = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("MONHOC.in"))) {
            int N = Integer.parseInt(sc.nextLine().trim());
            for (int i = 0; i < N; i++) {
                String code = sc.nextLine().trim();
                String name = sc.nextLine().trim();
                int credits = Integer.parseInt(sc.nextLine().trim());
                subjects.add(new Subject(code, name, credits));
            }
        } catch (FileNotFoundException e) {
            return;
        }
        Collections.sort(subjects, Comparator.comparing(Subject::getName));
        for (Subject subject : subjects) {
            System.out.println(subject);
        }
    }
}
