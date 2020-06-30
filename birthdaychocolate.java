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

    // Solusi dengan Brute Force
    /*Kompleksitas : 
      Waktu : O(n^2), Memori : O(1)*/
    static int birthday(List<Integer> s, int d, int m) {
        //Menghitung banyaknya kemungkinan dengan solusi Brute Force
        int count = 0;
        for(int i=0;i<=s.size()-m;i++){
            int sum = 0;
            for(int j=i;j<i+m;j++){
                sum+=s.get(j);
                
            }
            if(sum==d) count++;
        }
        return count;
    }
    
        // Solusi dengan Teknik Sliding Window
        /* Kompleksitas : 
          Waktu : O(n), Memori : O(1) */
    static int birthday(List<Integer> s, int d, int m) {
        int sum = 0;
        int count = 0;
        for(int i=0;i<m;i++){
            sum += s.get(i);
        }
        //Kalau di awal sudah sesuai
        if(sum==d) count++;
        //Menghitung banyaknya kemungkinan
        for(int i=m;i<s.size();i++){
            sum += (s.get(i)-s.get(i-m));
            if(sum==d) count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
