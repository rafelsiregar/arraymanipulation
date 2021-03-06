import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the reverseArray function below.
    //Solusi dengan menambah array baru
    static int[] reverseArray(int[] a) {
        int j = 0;
        int ra[] = new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            ra[j] = a[i];
            j++;
        }
        return ra;
    }
    
    //Solusi dengan dua pointer
    static int[] reverseArray(int[] a){
      int low = 0;
        int high = a.length-1;
        for(int i=0;i<a.length/2;i++){
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;high--;
        }
        return a;
    }
    
    //Modifikasi dari method di atas
    static int[] reverseArray(int[] a) {
        for(int i=0;i<a.length/2;i++){
            int temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        }
        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
