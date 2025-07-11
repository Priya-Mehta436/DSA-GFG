package Section02_Mathematics;

public class Power {
    public boolean isPowerOfAnother(int X, int Y) {
        // code here
        if (Y == 1) {
            return true;
        }
        if (X == 1) {
            return Y == 1;
        }
        int current = Y;
        while (current % X == 0) {
            current /= X;
            if (current == 1) {
                return true;
            }
        }
        return false;
    }
}