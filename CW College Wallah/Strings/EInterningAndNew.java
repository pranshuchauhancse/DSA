public class EInterningAndNew {
    public static void main(String[] args) {
        // String literals are stored in a common pool and are shared among all the references that point to the same string literal. This is called string interning.
        String s1 = "Pranshu";
        String s2 = "Pranshu";
        // both s1 and s2 point to the same string literal in the string pool, so they are equal
        if (s1 == s2) {
            System.out.println("s1 and s2 are equal");
        } else {
            System.out.println("s1 and s2 are not equal");
        }

        // when we create a new string using the new keyword, it creates a new object in the heap memory, even if the content of the string is the same as an existing string literal. So, they are not equal.
        String s3 = new String("Pranshu");
        if (s1 == s3) {
            System.out.println("s1 and s3 are equal");
        } else {
            System.out.println("s1 and s3 are not equal");
        }
    }
    
}
