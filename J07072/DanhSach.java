package J07072;

public class DanhSach {
    private String ten;
    public DanhSach(String ten) {
        this.ten = ten;
    }
    public String getTen() {
        String[] parts = ten.trim().split("\\s+");
        return parts[parts.length - 1];
    }

    public String getHo() {
        String[] parts = ten.trim().split("\\s+");
        return parts[0];
    }

    public String getDem() {
        String[] parts = ten.trim().split("\\s+");
        StringBuilder tenDem = new StringBuilder();
        for (int i = 1; i < parts.length - 1; i++) {
            tenDem.append(parts[i]).append(" ");
        }
        return tenDem.toString().trim();
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
        return result.toString().trim();
    }

    @Override
    public String toString() {
        return ten;
    }
}
