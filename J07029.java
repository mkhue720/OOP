//WA
import java.io.*;
import java.util.*;
public class J07029 {
    public static boolean ngto(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>) in.readObject();
        List<int[]> b = new ArrayList<>();
        int[] a = new int[1000001];
        for (Integer x : ds) {
            a[x]++;
        }
        for (int i = 2; i <= 1000000; i++) {
            if (a[i] > 0 && ngto(i) && ngto(a[i])) {
                b.add(new int[]{i, a[i]});
            }
        }
        Collections.sort(b, (x, y) -> Integer.compare(y[0], x[0]));
        for (int i = 0; i < 10 && i <b.size(); i++) {
            System.out.println(b.get(i)[0] + " " + b.get(i)[1]);
        }
    }
}
