public class DSubstring {
    public static void main(String[] args) {
        String s = "Pranshu Chauhan";
        // substring(i,j) and substring(i) methods are used to get a substring of the string starting from index i and ending at index j-1 or till the end of the string respectively
        String substring1 = s.substring(0, 7);  
        System.out.println("Substring from index 0 to 7: " + substring1);

        String substring2 = s.substring(8);
        System.out.println("Substring from index 8 to end: " + substring2); 
    }
     
}
