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


//Thanks to JAVAAID Coding Interview Preparation for teaching me about this concept.
//Time Complexity : O(n+max(a))
//Space Complexity : O(max(a))
class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
    public static int max(List<Integer> al){
        int maksimum = al.get(0);
        for(int i=1;i<al.size();i++){
            if(al.get(i)>maksimum)
                maksimum = al.get(i);
        }
        return maksimum;
    }

    public static int max(int a, int b){
        return a>b? a:b;
    }
    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
        int[] frequency = new int[max(a)+1];
        int res = Integer.MIN_VALUE;
        for(int i=0;i<a.size();i++){
            frequency[a.get(i)]++;
        }
        //Mencari jumlah elemen maksimum yang anggotanya hanya i dan i+1
        for(int i=0;i<frequency.length-1;i++){
            res = max(res, frequency[i]+frequency[i+1]);
        }
        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
