//Given a number n, find the value of n raised to the power of its own reverse. Note: The result will always fit into a 32-bit signed integer.

package Section02_Mathematics;

public class PowerNumber {
    public int reverseExponentiation(int n) {
        // code here
        int reverse = reverseNumber(n);
        return power(n, reverse);
    }
    private int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
    private int power(int base, int exp) {
        int res = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                res *= base;
            }
            base *= base;
            exp >>= 1;
        }
        return res;
    }
}
