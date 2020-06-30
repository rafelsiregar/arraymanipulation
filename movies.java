import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int reversed(int a){
        int rev = 0;
        while(a!=0){
            int digit = a%10;
            rev = rev*10+digit;
            a /=10;
        }
        return rev;
    }

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int count = 0;
        while(i<=j){
            if(Math.abs(i-reversed(i))%k==0) count++;
            i++;
        }
        System.out.println(count);
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
