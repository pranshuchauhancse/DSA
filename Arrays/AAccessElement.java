class ArrayExample {
    void demoArrays() {
        int[] ages = new int[3];
        float[] weighs = new float[3];
        String[] names = new String[3];
        int[] intArray ={1,2,3,4};
        ages[0] = 34;
        ages[1] = 3;
        ages[2] = 4;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
    }
}

public class AAccessElement {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample(); // fixed class name
        obj.demoArrays();
    }
}
