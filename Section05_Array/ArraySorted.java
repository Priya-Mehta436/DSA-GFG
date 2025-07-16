//Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

package Section05_Array;

public class ArraySorted {
    public boolean isSorted(int[] arr) {
        // code here
        for(int i =1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
