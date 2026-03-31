public class ClassObject {
    // Class to represent a simple object
    static class MyClass {
        int value;

        MyClass(int value) {
            this.value = value;
        }

        void display() {
            System.out.println("Value: " + value);
        }
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        MyClass obj2 = new MyClass(20);

        obj1.display(); // Output: Value: 10
        obj2.display(); // Output: Value: 20
    }
    
}
