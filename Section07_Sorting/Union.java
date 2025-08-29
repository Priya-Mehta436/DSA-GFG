package Section07_Sorting;

import java.util.ArrayList;

public class Union {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        
        ArrayList<Integer> res = new ArrayList<>();
        
        int i = 0, j = 0;
        
        int n = a.length, m = b.length;

        while (i < n && j < m) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            if (a[i] < b[j]) {
                res.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                res.add(b[j]);
                j++;
            } else {
                res.add(a[i]);
                i++;
                j++;
            }
        }
        while (i < n) {
            if (i == 0 || a[i] != a[i - 1])
                res.add(a[i]);
            i++;
        }
        while (j < m) {
            if (j == 0 || b[j] != b[j - 1])
                res.add(b[j]);
            j++;
        }
        return res;
    }
}
