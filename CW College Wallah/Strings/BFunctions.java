public class BFunctions {
    public static void main(String[] args) {
        String s = "Pranshu Chauhan";

        //length method is used to get the length of the string
        int length = s.length();
        System.out.println(s.length());
        System.out.println("Length of the string: " + length);

        //charAt method is used to get the character at a specific index in the string
        char character = s.charAt(0);
        System.out.println(character);
        System.out.println("Character at index 0: " + s.charAt(0));

        //indexOf method is used to get the index of the first occurrence of a specific character or substring in the string
        int index = s.indexOf('a');
        System.out.println(index);
        System.out.println("Index of 'a': " + index);

        //compareTo method is used to compare two strings lexicographically
        String s1 = "Pranshu";
        String s2 = "Chauhan";
        int result = s1.compareTo(s2);
        System.out.println(result);
        if (result < 0) {
            System.out.println(s1 + " is less than " + s2);
        } else if (result > 0) {
            System.out.println(s1 + " is greater than " + s2);
        } else {
            System.out.println(s1 + " is equal to " + s2);
        }

        //contains method is used to check if a specific character or substring is present in the string
        System.out.println(s1.contains("Pr"));
        System.out.println(s1.startsWith("Pr"));
        System.out.println(s1.endsWith("hu"));

        //toLowerCase and toUpperCase methods are used to convert the string to lower case and upper case respectively
        //concat method is used to concatenate two strings
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat(s2));
    }
    
}
