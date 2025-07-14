//You are given a number n. You need to find nth Fibonacci number. F(n) = F(n-1) + F(n-2) ; where F(1)=1 and F(2)=1


package Section04_Recursion;

public class nthFibonacci {
    static int fibonacci(int n) {
        // Code here
        if(n<=1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
