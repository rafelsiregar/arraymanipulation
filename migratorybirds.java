import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    static int maxIndex(int[] arr){
        int idxMax = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[idxMax]) 
                idxMax = i;
        }
        return idxMax+1;
    }

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int[] kind = new int[5];
        Arrays.fill(kind, 0);
        for(int i : arr){
            kind[i-1]++;
        }
        return maxIndex(kind);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
