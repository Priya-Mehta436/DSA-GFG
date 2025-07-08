//Given two positive integers a and b, find GCD of a and b.
// Note: Don't use the inbuilt gcd function

package Section02_Mathematics;

public class Gcd {

    public static int gcd(int a, int b) {
        // code here
        if (b==0)
        return a;
        return gcd(b, a%b);
    }
}
    

