// Given a number n, find the nth term in the series 1, 3, 6, 10, 15, 21…

package Section02_Mathematics;

public class Nth {
    // User function Template for Java
    static int findNthTerm(int n) {
        // code here
        int nthTerm = (n * (n + 1)) / 2;
        return nthTerm;
    }
}