/*You are given n disks placed on a starting rod (from), with the smallest disk on top and the largest at the bottom. There are three rods: the starting rod(from), the target rod (to), and an auxiliary rod (aux).
You have to calculate the total number of moves required to transfer all n disks from the starting rod to the target rod, following these rules:
    1. Only one disk can be moved at a time.
    2. A disk can only be placed on top of a larger disk or on an empty rod.
Return the number of moves needed to complete the task.*/


package Section04_Recursion;

public class TowerOfHanoi {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        //code here
        if (n == 1) {
            return 1;
        }

        int moves1 = towerOfHanoi(n - 1, from, aux, to);
        int moves2 = towerOfHanoi(n - 1, aux, to, from);

        return moves1 + 1 + moves2;
    }
}