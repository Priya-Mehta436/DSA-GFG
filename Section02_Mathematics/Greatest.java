// Given 3 numbers a, b and c. Find the greatest number among them.

package Section02_Mathematics;

public class Greatest {
    public int greatestOfThree(int a, int b, int c) {
        // code here
        if(a>=b && a>=c)
        {
            return a;
        }
        else if(b>=c && b>=a){
            return b;
        }
        else 
        {
            return c;
        }
    }
}

