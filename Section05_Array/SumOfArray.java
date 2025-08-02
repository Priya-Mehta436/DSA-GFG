//Given an array, arr of n integers, and an integer element x, find whether element x is present in the array. Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.

package Section05_Array;

public class SumOfArray {
    int arraySum(int arr[]) {
        // code here
        int n = arr.length;
        int result = 0;
        for (int i= 0 ; i < n; i++) {
                result += arr [i];
            }
            return result;
    }
}