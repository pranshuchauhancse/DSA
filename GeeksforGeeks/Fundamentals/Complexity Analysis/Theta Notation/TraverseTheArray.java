public class TraverseTheArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        traverseArray(arr);
    }

    public static void traverseArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }    
}
