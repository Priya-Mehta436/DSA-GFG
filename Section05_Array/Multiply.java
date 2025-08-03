//You don't need to read input or print anything. Your task is to complete the function product() which takes the array Arr[] and its size N as inputs and returns the product of all elements.

package Section05_Array;

public class Multiply {

    public static int product(int arr[], int n) {
        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= arr[i];
        }
        return product;
    }
}