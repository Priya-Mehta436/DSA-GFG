package Section06_Searching;
public class SquareRoot {
    int floorSqrt(int n) {
        // code here
        int low = 1, high = n, ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            int mSq = mid * mid;
            if(mSq == n){
                return mid;
            }
            else if (mSq > n){
                high = mid - 1;
            }
            else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}