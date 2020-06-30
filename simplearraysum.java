import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
         int count = 0;
        for(int i=0;i<ar.length;i++){
            count+=ar[i];
        }
        return count;
    }
    
        // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long count = 0;
        for(int i=0;i<ar.length;i++){
            count += ar[i];
        }
        return count;
    }
    
        // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long count = 0, max, min;
        for(int i=0;i<arr.length;i++){
            count += arr[i];
        }
        if(arr[0]>arr[1]){
            max = arr[0];min=arr[1];
        } else {
            min = arr[0];max=arr[1];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
            else if(arr[i]<min) min=arr[i];
        }

        System.out.print((count-max)+" "+(count-min));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
