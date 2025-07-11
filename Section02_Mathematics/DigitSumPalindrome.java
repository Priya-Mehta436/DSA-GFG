//Given a number n. Return true if the digit sum(or sum of digits) of n is a Palindrome number otherwise false. A Palindrome number is a number that stays the same when reversed

package Section02_Mathematics;

public class DigitSumPalindrome {
    
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum = 0, num = n;
        
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        
        int reverseSum = 0;
        int temp = sum;
        while (temp != 0) {
            reverseSum = reverseSum * 10 + temp % 10;
            temp /= 10;
        }
        return sum == reverseSum;
    }
}
