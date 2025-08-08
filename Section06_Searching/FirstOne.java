/*Given a sorted array arr consisting of 0s and 1s. The task is to find the index (0-based indexing) of the first 1 in the given array.

NOTE: If one is not present then, return -1. */

package Section06_Searching;
public class FirstOne {
    // User function Template for Java
    public long firstIndex(int arr[]) {
        // Your code goes here
        int n = arr.length;
        int x = 1;
        int low = 0 , high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if (arr[mid] > x){
            high = mid - 1;
            }
            else if (arr[mid] < x){
            low = mid + 1;
            }
            else{
                if(mid == 0 || arr[mid - 1] != arr [mid]){
                    return mid;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return -1;
    }
}