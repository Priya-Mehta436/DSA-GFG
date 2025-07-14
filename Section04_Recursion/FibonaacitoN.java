//Given a positive integer N. Calculate the Fibonacci series till the number N. If N is a part of the series, include N as well.

package Section04_Recursion;

import java.util.ArrayList;

public class FibonaacitoN {
    // User function Template for Java
    ArrayList<Integer> nFibonacci(int N) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int a = 0, b = 1;
        while (a <= N) {
            result.add(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
        return result;
    }
}
