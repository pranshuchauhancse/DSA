public class BSProblem5 {
    //return the index of the target if it is in the array
    static int search(int[] a, int target){
        int start = 0;
        int end = a.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(a[mid] == target){
                return mid;
            }else if(a[mid] <= a[end]){
                if(target > a[mid] && target <= a[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(target >= a[start] && target < a[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {9,10,11,12,1,2,3,4,5,6,7,8};
        int target = 4;
        System.out.println(search(a, target));
    }
}
