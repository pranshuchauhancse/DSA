public class GPerformanceOfString {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 10; i++) {
            s = s + i;
        }
        // "" "1" "12" "123" "1234" "12345" "123456" "1234567" "12345678" "123456789"
        System.out.println(s);
    }
}
