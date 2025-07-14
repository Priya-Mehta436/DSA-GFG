//You are given a number n. You need to find the count of digits in n.

package Section04_Recursion;

public class countdigits {
    public static int countDigits(int n) {
        // Code here
        if(n<10)
            return 1;
        return 1 + countDigits(n / 10);
    }
}
