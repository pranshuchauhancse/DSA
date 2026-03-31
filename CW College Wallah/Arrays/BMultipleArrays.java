class ArrayExamples {
    void multiArrays() {
//        int[][] ages= new int[5][3]  // 5 rows, 3 columns

        int[][] arr = {{2, 3}, {4, 5}}; // 2x2 array

        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
    }
}
public class BMultipleArrays{
    public static void main(String[] args) {
        ArrayExamples obj = new ArrayExamples(); // create object
        obj.multiArrays(); // call correct method
    }
}
