import java.util.*;

public class J03005 {
    public static String chuanHoa(String s) {
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1).toLowerCase());
                result.append(" ");
            }
        }
        return result.toString().trim();
    }

    public static String xuLy(String s) {
        s = chuanHoa(s);
        String[] words = s.split("\\s+");
        if (words.length == 1) {
            return words[0] ;
        }
        StringBuilder ten = new StringBuilder();
        int tmp = words.length;
        for (int i = tmp - 1; i >= 2; i--) {
            ten.append(words[words.length - i]).append(" ");
        }
        ten.append(words[words.length - 1]);
        StringBuilder ho = new StringBuilder();
        ho.append(words[0]).append(" ");
        return ten.toString().trim() + ", " + ho.toString().trim().toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String s = sc.nextLine();
            System.out.println(xuLy(s));
        }
        sc.close();
    }
}
