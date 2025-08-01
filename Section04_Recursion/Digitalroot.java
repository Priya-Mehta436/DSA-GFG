//You are given a number n. You need to find the digital root of n. DigitalRoot of a number is the recursive sum of its digits until we get a single digit number.

package Section04_Recursion;

public class Digitalroot {
    public static int digitalRoot(int n) {
        // code here
        if (n == 0) 
        {
            return 0;
        }
        if (n % 9 == 0)
        {
            return 9;
        }
        else{
            return (n % 9);
        }
    }
}
