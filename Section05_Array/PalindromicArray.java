/*Given an array arr[] of positive integers. Return true if all the array elements are palindrome otherwise, return false. */

package Section05_Array;

public class PalindromicArray {
    /*Complete the Function below*/
    public static boolean isPalinArray(int[] arr) {
        // add code here.
          int n = arr.length;
            for(int i =0; i < n; i++){
                int num = arr[i];
                int temp = num;
                int rev = 0;
                
                while(num>0){
                    int digit = num % 10;
                    rev = rev * 10 + digit;
                    num = num/10;
                }
                if(temp != rev){
                return false;
                }
            }
        return true;
    }
}