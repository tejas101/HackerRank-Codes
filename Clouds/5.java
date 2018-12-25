import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int J=0;
          for(int i=0;i<c.length-1;i++){
             if(c.length-3>=i){//if true, you can investigate for taking a jump of 2 steps 
                 if(c[i+2]==0){//if true, you can take a jump of 2 steps
                     J++;
                     i=i+1;//You can skip middle index(eg from 0 to 2 and 1 can be skipped) but just incerement by one as for loop will incerement it by one more time.
                 }
                 else//now you have to take jump of 1 step
                 {
                     //if(c[i+1]==0){
                         J++;
                         //i++;
                     //}
                 }
             } 
             else//You can't investigate the 2 step jump or else array index out of bound error will be shown
             if (c[i + 1] == 0) {
                J++;
                // i++;
            }

          }
    return J;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
