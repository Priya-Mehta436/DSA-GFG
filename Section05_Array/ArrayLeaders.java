//You are given an array arr of positive integers. Your task is to find all the leaders in the array. An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.

package Section05_Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders{
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> leaders = new ArrayList<>();
        int currLdr = arr [arr.length - 1];
        leaders.add(currLdr);
        
        for (int i = arr.length - 2; i >= 0; i--){
            if(arr [i] >= currLdr){
                currLdr =  arr[i];
               leaders.add(currLdr);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}