public class DPractise1 {
    public static void main(String[] args) {
         // given a string s, print all the substrings of s
        String s = "abcd";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }
    
}
