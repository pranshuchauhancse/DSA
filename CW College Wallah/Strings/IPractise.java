public class IPractise {
    //PhyISCS -> pHYics toogle in sringbuilder
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("PhyISCS");
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.setCharAt(i, Character.toLowerCase(c));
            } else {
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }
        System.out.println(sb); // Output: pHYics
    }
    
} 