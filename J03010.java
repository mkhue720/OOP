//import java.util.*;
//public class J03010 {
//    public static String chuanHoa(String chuoi) {
//        String[] words = chuoi.split("\\s+");
//        StringBuilder result = new StringBuilder();
//        for (String word : words) {
//            if (!word.isEmpty()) {
//                result.append(word.toLowerCase());
//                result.append(" ");
//            }
//        }
//        return result.toString().trim();
//    }
//
//    public static String xuLy(String chuoi) {
//        chuoi = chuanHoa(chuoi);
//        String[] words = chuoi.split("\\s+");
//        if (words.length == 1) {
//            return words[0] + "@ptit.edu.vn";
//        }
//        StringBuilder ten = new StringBuilder();
//        ten.append(words[words.length - 1]);
//        StringBuilder ho = new StringBuilder();
//    }
//
//    public static void main(String[] args) {
//
//    }
//}