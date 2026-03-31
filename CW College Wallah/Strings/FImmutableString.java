public class FImmutableString {
    public static void main(String[] args) {
        //immutable means that once a string object is created, its content cannot be changed. Any operation that seems to modify a string actually creates a new string object with the modified content.
        String s = "Hello"; // Helyo // 3
        // String x = "Hello";
        // x="Mello";
        // System.out.println(x);
        s = s.substring(0,3) + 'y' + s.substring(4);
        System.out.println(s);
    }
    
}
