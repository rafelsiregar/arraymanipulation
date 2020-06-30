import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int max(int[] arr){
        int maksimum = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maksimum)
                maksimum = arr[i];
        }
        return maksimum;
    }

    // Solusi dengan array
    static int lonelyinteger(int[] a) {
        int[] freq = new int[max(a)+1];
        for(int i=0;i<a.length;i++){
            freq[a[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1)
                return i;
        }
        return -1;
    }
    
    // Solusi dengan XOR
    static int lonelyinteger(int[] a) {
        int res = 0;
        for(int i=0;i<a.length;i++)
            res ^= a[i]  
        return res;
     }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
