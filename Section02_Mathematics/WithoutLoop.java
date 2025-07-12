//Given an positive integer n, print numbers from 1 to n without using loops. Implement the function printTillN() to print the numbers from 1 to n as space-separated integers.

package Section02_Mathematics;

public class WithoutLoop {
    static void printTillN(int N) {
        // code here
        printNumbers(1, N);
    }

    static void printNumbers(int current, int N) {
        if (current > N) return;
        System.out.print(current + " ");
        printNumbers(current + 1, N);
    }
}
