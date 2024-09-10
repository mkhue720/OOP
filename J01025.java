import java.util.*;
public class J01025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X1_1 = sc.nextInt();
        int Y1_1 = sc.nextInt();
        int X2_1 = sc.nextInt();
        int Y2_1 = sc.nextInt();
        int X1_2 = sc.nextInt();
        int Y1_2 = sc.nextInt();
        int X2_2 = sc.nextInt();
        int Y2_2 = sc.nextInt();

        int minX = Math.min(X1_1, X1_2);
        int minY = Math.min(Y1_1, Y1_2);
        int maxX = Math.max(X2_1, X2_2);
        int maxY = Math.max(Y2_1, Y2_2);

        int rong = maxX - minX;
        int cao = maxY - minY;
        int canh = Math.max(rong, cao);
        int dt = canh * canh;
        System.out.println(dt);
    }
}
