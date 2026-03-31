public class IStringBuilder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb.toString()); // Output: Hello World
        // StringBuilder sb1 = new StringBuilder();
        // sb1.append("Hello");
        // System.out.println(sb1.toString()); // Output: Hello
        
        // helo -> melo 
        StringBuilder str = new StringBuilder("helo");
        System.out.println(str); // Output: helo
        str.setCharAt(0, 'm');
        System.out.println(str);// Output: melo
        
        // append(string str) method is used to add the specified string to the end of the current string builder object. It modifies the original string builder object and returns a reference to the same object, allowing for method chaining.
        //we can append any type of data to the StringBuilder object, such as int, double, boolean, char, etc. The append method will convert the data to a string representation and add it to the end of the current string builder object.
        str.append(" world");
        System.out.println(str); // Output: melo world

        // insert(int offset, char c) method is used to insert the specified character at the specified offset in the current string builder object. It modifies the original string builder object and returns a reference to the same object, allowing for method chaining. The deleteCharAt(int index) method is used to delete the character at the specified index in the current string builder object. It also modifies the original string builder object and returns a reference to the same object, allowing for method chaining.
        // The delete(int start, int end) method is used to delete a sequence of characters from the current string builder object, starting from the specified start index and ending at the specified end index (exclusive). It also modifies the original string builder object and returns a reference to the same object, allowing for method chaining.
        // The insert() method takes two parameters: the offset, which is the index at which the character should be inserted, and the character itself. The deleteCharAt() method takes one parameter: the index of the character to be deleted. The delete() method takes two parameters: the start index and the end index (exclusive) of the characters to be deleted.
        str.insert(2, 'b');
        System.out.println(str); // Output: meblo world
        str.deleteCharAt(2);
        System.out.println(str); // Output: mlo world
        str.delete(2, 3);
        System.out.println(str); // Output: melo world

        // reverse() and delete() methods of StringBuilder class are used to reverse the characters in the string builder object and to delete a sequence of characters from the string builder object, respectively. The reverse() method modifies the original string builder object and returns a reference to the same object, while the delete() method takes two parameters, start and end, which specify the range of characters to be deleted from the string builder object. The delete() method also modifies the original string builder object and returns a reference to the same object.
        str.reverse();
        System.out.println(str); // Output: dlrow olem
        str.delete(0, 5);
        System.out.println(str); // Output: olem

        
    }
}