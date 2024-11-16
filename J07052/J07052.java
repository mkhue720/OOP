package J07052;
import java.util.*;
import java.io.*;
public class J07052 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int N = Integer.parseInt(sc.nextLine());
        List<ThiSinh> ds = new ArrayList<>();
        while (N-- > 0) {
            String maTS = sc.nextLine().trim();
            String tenTS = sc.nextLine().trim();
            double dToan  = Double.parseDouble(sc.nextLine().trim());
            double dLy = Double.parseDouble(sc.nextLine().trim());
            double dHoa = Double.parseDouble(sc.nextLine().trim());
            ThiSinh ts = new ThiSinh(maTS, tenTS, dToan, dLy, dHoa);
        }
    }
}
