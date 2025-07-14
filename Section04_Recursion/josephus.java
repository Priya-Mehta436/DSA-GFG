//You are playing a game with n people standing in a circle, numbered from 1 to n. Starting from person 1, every kth person is eliminated in a circular fashion. The process continues until only one person remains. Given integers n and k, return the position (1-based index) of the person who will survive

package Section04_Recursion;

public class josephus{
    // Recursive Josephus function (1-based index)
    public int josephus(int n, int k) {
        if (n == 1)
            return 1;
        else
            return (josephus(n - 1, k) + k - 1) % n + 1;
    }

    // You might not need a wrapper now, but keeping it public
    public int myJos(int n, int k) {
        return josephus(n, k);
    }
}

