
class ArryExamples {
    void LengthArrays() {
        int[][] arr = {{2, 3}, {4, 5}}; // 2x2 array

        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr.length);
    }
}
public class CLengthArrays {
    public static void main(String[] args) {
        ArryExamples obj = new ArryExamples(); // create object
        obj.LengthArrays(); // call correct method
    }
}
