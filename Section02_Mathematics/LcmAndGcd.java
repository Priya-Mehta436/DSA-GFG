// Given two integers a and b, You have to compute their LCM and GCD and return an array containing their LCM and GCD

package Section02_Mathematics;

public class LcmAndGcd {

    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int gcdValue = gcd(a, b);
        int lcmValue = (a * b) / gcdValue;
        return new int[]{lcmValue, gcdValue};  
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
    
