import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     static int[] removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int item : nums) set.add(item);
        int len = set.size();
        int[] res = new int[len];
        int i = 0;
        for(int item : set) res[i++] = item;
        return res; 
    }

    static int getValidIndex(int[] arr, int key){
        int low =0;
        int high = arr.length-1;
        int count = -1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<=key){
                count = mid;
                low = mid+1;
            }else high = mid-1;
        }
        return count;
    }
    //Solution using Binary Search
    static long triplets(int[] a, int[] b, int[] c) {
        long count = 0;
        a = removeDuplicates(a);
        b = removeDuplicates(b);
        c = removeDuplicates(c);

        Arrays.sort(a);Arrays.sort(b);Arrays.sort(c);
        for(int i=0;i<b.length;i++){
            long a_to_add = getValidIndex(a, b[i]) +1;
            long c_to_add = getValidIndex(c, b[i])+ 1;
            count += (a_to_add*c_to_add);
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] lenaLenbLenc = scanner.nextLine().split(" ");

        int lena = Integer.parseInt(lenaLenbLenc[0]);

        int lenb = Integer.parseInt(lenaLenbLenc[1]);

        int lenc = Integer.parseInt(lenaLenbLenc[2]);

        int[] arra = new int[lena];

        String[] arraItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < lena; i++) {
            int arraItem = Integer.parseInt(arraItems[i]);
            arra[i] = arraItem;
        }

        int[] arrb = new int[lenb];

        String[] arrbItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < lenb; i++) {
            int arrbItem = Integer.parseInt(arrbItems[i]);
            arrb[i] = arrbItem;
        }

        int[] arrc = new int[lenc];

        String[] arrcItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < lenc; i++) {
            int arrcItem = Integer.parseInt(arrcItems[i]);
            arrc[i] = arrcItem;
        }

        long ans = triplets(arra, arrb, arrc);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
