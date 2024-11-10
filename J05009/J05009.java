package J05009;
import java.util.*;
public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<ThiSinh> ds = new ArrayList<>();
        while (n-- > 0) {
            String ten = sc.nextLine().trim();
            String ns = sc.nextLine().trim();
            double mon1 = Double.parseDouble(sc.nextLine().trim());
            double mon2 = Double.parseDouble(sc.nextLine().trim());
            double mon3 = Double.parseDouble(sc.nextLine().trim());
            ThiSinh ts = new ThiSinh(ten, ns, mon1, mon2, mon3);
            ds.add(ts);
        }
        List<ThiSinh> maxDs = Max(ds);
        Collections.sort(maxDs, Comparator.comparing(thiSinh -> thiSinh.getMa()));
        for (ThiSinh ts : maxDs) {
            System.out.println(ts);
        }
    }

    public static List<ThiSinh> Max(List<ThiSinh> ds) {
        double maxDiem = ds.get(0).tongDiem();
        for (ThiSinh ts : ds) {
            maxDiem = Math.max(maxDiem, ts.tongDiem());
        }
        List<ThiSinh> maxDs = new ArrayList<>();
        for (ThiSinh ts : ds) {
            if (ts.tongDiem() == maxDiem) {
                maxDs.add(ts);
            }
        }
        return maxDs;
    }
}
