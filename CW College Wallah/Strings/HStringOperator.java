public class HStringOperator { 
    public static void main(String[] args) {
        //
        String s = "Pranshu";
        String s1 = "Pranshu";
        String s2 = new String("Pranshu");
        // == operator is used to compare the reference of the string objects, not the content of the strings. So, it will return true for s and s1 because they point to the same string literal in the string pool, but it will return false for s and s2 because s2 is a new string object created in the heap memory.
        System.out.println(s == s1); // true
        System.out.println(s == s2); // false
        // equals method is used to compare the content of the strings. So, it will return true for s and s1 because they have the same content, and it will also return true for s and s2 because they also have the same content.
        System.out.println(s.equals(s1)); // true
        System.out.println(s.equals(s2)); // true
    }    
}
 