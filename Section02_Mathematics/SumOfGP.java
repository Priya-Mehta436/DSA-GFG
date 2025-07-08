package Section02_Mathematics;

public class SumOfGP {
    // User function Template for Java
    public long sum_of_gp(long n, long a, long r) {

        // Code here
        if (r == 1) {
            return n * a;
        } else {
            long r_power_n = 1;  // Calculate r^n
            for (int i = 0; i < n; i++) {
                r_power_n *= r;
            }
            return a * (1 - r_power_n) / (1 - r);
        }
    }
}
