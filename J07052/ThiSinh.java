package J07052;

public class ThiSinh {
    private String maTS;
    private String tenTS;
    private double dToan;
    private double dLy;
    private double dHoa;

    public ThiSinh(String maTS, String tenTS, double dToan, double dLy, double dHoa) {
        this.maTS = maTS;
        this.tenTS = chuanHoa(tenTS);
        this.dToan = dToan;
        this.dLy = dLy;
        this.dHoa = dHoa;
    }

    private double diemUT() {
        String kv = maTS.substring(0, 3);
        switch (kv) {
            case "KV1": return 0.5;
            case "KV2": return 1.0;
            default: return 2.5;
        }
    }

    public double tinhDiem() {
        return dToan * 2 + dLy + dHoa + diemUT();
    }

    public static String chuanHoa(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1).toLowerCase());
                result.append(" ");
            }
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return maTS + tenTS + diemUT() + String.format("%d, tinhDiem()");
    }


}
