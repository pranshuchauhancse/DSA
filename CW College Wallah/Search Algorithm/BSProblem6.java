public enum BSProblem6 {
    // search element in rotated sorted array with duplicate element , return true if the elemnt is found else return false
    static boolean search(int[] a, int target){
        int start = 0;
        int end = a.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(a[mid] == target){
                return true;
            }else if(a[mid] < a[end]){
                if(target > a[mid] && target <= a[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else if(a[mid] > a[end]){
                if(target >= a[start] && target < a[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                end--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a = {0,0,0,1,1,1,2,0,0,0};
        int target = 2;
        System.out.println(search(a, target));
    }
    
}
