/*Given an array arr. Your task is to find the minimum and maximum elements in the array.

Note: Return a Pair that contains two elements the first one will be a minimum element and the second will be a maximum. */

package Section05_Array;

// User function Template for Java
// User function Template for Java
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

// Java users need to return result in Pair class
// For Example -> return new Pair(minimum,maximum)

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int minimum = arr[0];
        int maximum = arr[0];
        int n = arr.length;
        
        for (int i = 1; i < n ; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        
        return new Pair(minimum, maximum);
    }
}
