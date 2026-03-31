public enum IPractisee{
    public static void main(String[] args) {
        String str = "ababa";
        String longestPalindrome = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                String reversedSubstring = new StringBuilder(substring).reverse().toString();
                if (substring.equals(reversedSubstring) && substring.length() > longestPalindrome.length()) {
                    longestPalindrome = substring;
                }
            }
        }
        System.out.println("Longest palindromic substring: " + longestPalindrome); // Output: Longest palindromic substring: ababa
    }
} 
// reverse each word in string Next question
// aaabbbcccc -> a3b3c4 next question
