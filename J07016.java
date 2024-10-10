import java.io.*;
import java.util.*;

public class J07016 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ds1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> ds2 = (ArrayList<Integer>) in2.readObject();
        int a[] = new int[10001];
        int b[] = new int[10001];
        for (Integer x : ds1) {
            a[x]++;
        }
        for (Integer x : ds2) {
            b[x]++;
        }
        for (int i = 2; i <= 10000; i++) {
            if (a[i] > 0 && ngto(i)) {
                System.out.println(i + " " + a[i] + " " + b[i]);
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
