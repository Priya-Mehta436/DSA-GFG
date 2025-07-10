//Given a number n and a value k. From the right, set the kth bit in the binary representation of n. The position of the Least Significant Bit(or last bit) is 0, the second last bit is 1 and so on. 

package Section03_BitMagic;

public class Set_Kth_Bit {
    // User function Template for Java
class Solution {
    static int setKthBit(int n, int k) {
        // code here
        return n | (1<<k);
        
        }
    }
    
}
