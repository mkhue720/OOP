import java.util.*;

public class J02017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        for (int num : A) {
            if (!stack.isEmpty() && (stack.peek() + num) % 2 == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        System.out.println(stack.size());
    }
}