//Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value. Floor value of any number is the greatest Integer which is less than or equal to that number

package Section02_Mathematics;

public class SquareRoot {

    class Solution {
    int floorSqrt(int n) {
        // code here
        if (n == 0 || n == 1) {
            return n;
        }
        int sqrRoot = 0;
        while(sqrRoot*sqrRoot <= n){
            sqrRoot++;
        }
        return sqrRoot-1;
        }
    }
    
}
