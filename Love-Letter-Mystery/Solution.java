import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the theLoveLetterMystery function below.
    static int theLoveLetterMystery(String s) {
   char[] a = s.toCharArray();

       int i=0;
        int j=a.length-1;
        int cost=0;
        for(;i<j;i++,j--){

             if(a[i]<a[j]){
              cost+=a[j]-a[i];
              a[j]=a[i];
              
           }
           else{
               if(a[i]>a[j]){
              cost+=a[i]-a[j];
              a[i]=a[j];
              
           }
           }

        }

        System.out.println("");

return cost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = theLoveLetterMystery(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
