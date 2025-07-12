//Given a positive integer N, write a function to find if it is a power of three or not.

package Section02_Mathematics;

public class Power_3 {
    // User function Template for Java
    static String isPowerof3(int N) {
        // code here
          while(N>1)
        {
          if(N%3!=0)
          return "No";
          N=N/3;
        }
        return "Yes";
    }
}
