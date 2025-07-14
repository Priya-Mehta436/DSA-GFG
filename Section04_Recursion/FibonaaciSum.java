/*Given a number positive number N, find the value of f0 + f1 + f2 +... + fN where fi indicates ith Fibonacci number.
Remember that f0 = 0, f1 = 1, f2 = 1, f3 = 2, f4 = 3, f5 = 5,
Since the answer can be very large, the answer takes modulo with 1000000007 and returned.*/

package Section04_Recursion;

public class FibonaaciSum {
    // User function Template for Java
    static long fibSum(long N) {
        // code here
        int mod = 1000000007;
        long a = 0;
        long b = 1;
        long sum = a + b;
        if (N == 0){ 
            return a;
        }
        if (N == 1) {
            return sum % mod;
        }

        for (int i = 2; i <= N; i++) {
            long c = (a + b) % mod;
            sum = (sum + c) % mod;
            a = b;
            b = c;
        }
        return sum % mod;
    }
}
    
