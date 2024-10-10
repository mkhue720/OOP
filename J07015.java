import java.io.*;
import java.util.*;

public class J07015 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>) in.readObject();
        int a[] = new int[10001];
        for (Integer x : ds) {
            a[x]++;
        }
        for (int i = 2; i <= 10000; i++) {
            if (a[i] > 0 && ngto(i)) {
                System.out.println(i + " " + a[i]);
            }
        }
    }
    public static boolean ngto(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
