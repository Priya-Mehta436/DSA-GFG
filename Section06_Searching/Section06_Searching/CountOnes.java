/*You are given a binary array that is sorted in non-increasing order, meaning all the 1's appear before the 0's. Find the total number of 1's present in the array. */

package Section06_Searching;
public class CountOnes {
    public int countOnes(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == 1) {
               
                if (mid == n - 1 || arr[mid + 1] == 0) {
                    return mid + 1;
                } else {
                    low = mid + 1;
                }
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }   
    public static void main(String[] args) {
        CountOnes sol = new CountOnes();
        int[] arr = {1, 1, 1, 0, 0, 0};
        System.out.println("Total number of 1's: " + sol.countOnes(arr));
    }
}
