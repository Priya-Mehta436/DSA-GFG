//You are given an array arr(0-based index) and two positive integer index and val. You need to insert an val at given index.

package Section05_Array;
import java.util.ArrayList;

public class AtIndex {
    public void insertAtIndex(ArrayList <Integer> arr, int index, int val) {
        // code here
         arr.add(index,val);
    }
}
