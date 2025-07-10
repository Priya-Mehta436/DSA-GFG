
//Given two positive integer n and  k, check if the kth index bit of n is set or not.
//  Note: A bit is called set if it is 1. 

 package Section03_BitMagic;

public class Check_Kth_Bit {
    static boolean checkKthBit(int n, int k) {
        // code here
        if ((n & (1<<k)) != 0 ){
            return true;
        }
        else 
        {
            return false;
        }
    }
}
