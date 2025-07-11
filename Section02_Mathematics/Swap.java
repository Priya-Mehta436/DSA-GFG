// You are given two numbers a and b. Your task is to swap the given two numbers. Note: Try to do it without a temporary variable.
    
package Section02_Mathematics;

import java.util.ArrayList;
import java.util.List;

public class Swap {

   class Solution {
    static List<Integer> get(int a, int b) {
        // code here
         a = a + b;
        b = a - b;
        a = a - b;
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(a);
        numbers.add(b);
        return numbers;
      }
    }
}
