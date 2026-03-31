public class BSProblem3 {
    // sq. root of non negative number
    public static int squareRoot(int n){
        
        int left = 1;
        int right = n;
        int ans = 0;

        while(left<=right){
            int mid = left + (right - left) / 2;
            if(mid*mid == n){
                return mid;
            }else if(mid*mid < n){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(squareRoot(n));
    }
}
