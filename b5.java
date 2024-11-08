//import java.util.*;
//import java.io.*;
//import java.nio.file.*;
//public class b5 {
//    public static void main(String[] args) throws IOException {
//        String currentDir = System.getProperty("user.dir");
//        String institusionPath = currentDir + "\\src\\INSTITUTION.in";
//        String registerPath = currentDir + "\\src\\REGISTER.in";
//        Map<String, String> institusionMap = new HashMap<>();
//        Map<String, String> registerMap = new HashMap<>();
//        BufferedReader institusionReader = new BufferedReader(new FileReader(institusionPath));
//        String line;
//        int dem = 0;
//        while((line = institusionReader.readLine()) != null) {
//            if (dem > 0) {
//                String[] parts = line.split(" ", 2);
//                institusionMap.put(parts[0], parts[1]);
//            }
//            dem++;
//        }
//        institusionReader.close();
//        int dem2 = 0;
//        BufferedReader registerReader = new BufferedReader(new FileReader(registerPath));
//        while((line = registerReader.readLine()) != null) {
//            if (dem2 > 0) {
//                String[] parts = line.split(" ", 2);
//                String abbreviation = parts[0];
//                String team = parts[1];
//                registerMap.computeIfAbsent(abbreviation, k -> new ArrayList<>()).add(team);
//            }
//            dem2 ++;
//        }
//        registerReader.close();
//        List<String> sortedAbbreviations = new ArrayList<>(registerMap.keySet());
//        Collections.sort(sortedAbbreviations);
//        for(String abbreviation : sortedAbbreviations) {
//
//        }
//    }
//}
