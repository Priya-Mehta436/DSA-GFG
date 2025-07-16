//Given an array arr, rotate the array by one position in clockwise direction.

package Section05_Array;

public class Rotate {
    // // User function Template for Java
    public void rotate(int[] arr) {
        // code here
        int temp = arr [arr.length-1];
        for(int i = arr.length-1; i>0;  i--){
            arr[i] = arr[i-1];
        }
         arr[0] = temp;
    }
}
