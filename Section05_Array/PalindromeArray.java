//Given an array arr, the task is to find whether the arr is palindrome or not. If the arr is palindrome then return true else return false.An array is said to be palindrome if its reverse array matches the original array. 

package Section05_Array;

public class PalindromeArray {

class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        int n = arr.length;
        int low = 0, high = n -1;
        int [] reversed = new int[n];
        int count = 0;
           
        for(int i =0; i < n; i++){
            reversed[i] = arr[i];
        }
        
        while(low<high){
            int temp = reversed[low];
            reversed[low] = reversed[high];
            reversed[high] = temp;
            low++;
            high--;
        }
        
        
        for(int i =0; i < n; i++){
            
            if( arr[i] == reversed[i]){
            count++;
             }
        }
            if(count == n){
                return true;
            }
            else {
                 return false;
        }
    }

    }
}
