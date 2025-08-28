package Section07_Sorting;

import java.util.ArrayList;

public class intersection {
    public ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int m = arr1.length;
        int n = arr2.length;
        
        int i =0, j = 0;
        while(i<m && j<n){
            if(i>0 && arr1[i] == arr1[i-1]){
                i++;
                continue;
            }
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else {
                result.add(arr1[i]);
                i++;
                j++; 
            }
        }
        return result;
    }
} 