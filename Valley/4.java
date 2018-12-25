import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
          int M=0;
          int V=0;
          int valC=0;
           for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'U' && V==0){
             M++;
             continue;
            }
            else{
               if(s.charAt(i) == 'D' && V==0 && M!=0) {
                   M--;
                    continue;

               }
            }

            if(s.charAt(i) =='D' && M==0){
             V++;
                continue;

            }
            else{
                if(s.charAt(i)=='U' && M==0 && V!=0){
                V--;
                if(V==0)
                valC++;

                    continue;
                }
            }

    }
    return valC;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
