package Section07_Sorting;
import java.util.Scanner;
import java.util.Arrays;

public class sortString {
    public static void main(String[] args) {
        // Your code here
         Scanner scan = new Scanner(System.in);
        
        int T = scan.nextInt();
        scan.nextLine();
        
        while (T-- > 0) {
            String S = scan.nextLine();
            char arr[]  = S.toCharArray();
            Arrays.sort(arr);
    
            System.out.println(new String(arr));
        }
        
        scan.close();
    }
}