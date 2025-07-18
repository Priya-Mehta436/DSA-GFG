//Given an array arr[]. The task is to rotate the array by d elements where d ≤ arr.size.

package Section05_Array;
public class RotatingArray {
    void leftRotate(int arr[], int d) {
        // code here
        int n = arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }
    private void reverse(int arr[], int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
