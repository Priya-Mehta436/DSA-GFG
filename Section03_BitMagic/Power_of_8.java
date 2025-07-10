//Given a positive integer N, The task is to find if it is a power of eight or not.

package Section03_BitMagic;

public class Power_of_8 {
    // User function Template for Java
    public String is_power_of_eight(Long n) {
        // Code here
            while(n>1)
        {
          if(n%8!=0)
          return "no";
          n=n/8;
        }
        return "yes";
    }
}
