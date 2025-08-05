/*Given two arrays a[] and b[] of equal size, the task is to find whether the elements in the arrays are equal.
Two arrays are said to be equal if both contain the same set of elements, arrangements (or permutations) of elements may be different though.
Note: If there are repetitions, then counts of repeated elements must also be the same for two arrays to be equal. */

package Section05_Array;

import java.util.Arrays;

public class EqualArray {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        
        int n = a.length;
        for (int i = 0; i < n; i++ ){
            if(a[i] != b[i]){
                return false;
                }
        }
        
        return true;
    }
}
