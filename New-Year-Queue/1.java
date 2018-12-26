    import java.awt.SystemTray;
    import java.io.*;
    import java.math.*;
    import java.security.*;
    import java.text.*;
    import java.util.*;
    import java.util.concurrent.*;
    import java.util.regex.*;
//Test Case : https://hr-testcases-us-east-1.s3.amazonaws.com/15305/input02.txt?AWSAccessKeyId=AKIAJ4WZFDFQTZRGO3QA&Expires=1545792486&Signature=Z73ZyeQiy2P%2FEfg3LLqX%2F2zB0pg%3D&response-content-type=text%2Fplain
    public class Solution {

        // Complete the minimumBribes function below.
        static void minimumBribes(int[] q) {
            int counter=0;
            //int shifted=0;
            //for(int i=0;i<=q.length-1;i++)
                //System.out.println(q[i]);
                
            for(int i=0;i<=q.length-1;i++)
                //int temp=;
                if(q[i]-(i+1)>2){
                        System.out.println("Too chaotic");
                        return;
                }
                //else
                //System.out.println(q[i]+"-"+(i+1)+"="+(q[i] - (i + 1)));
            
                for(int ik=0;ik<q.length;ik++)
                 for(int j=0;j<q.length-1;j++)
                  {
                     if(q[j]>q[j+1])
                     {
                         int temp=q[j];
                         q[j]=q[j+1];
                         q[j+1]=temp;
                         counter++;
                     }

                  }
            
                

                    

        
        System.out.println(counter);
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int t = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int tItr = 0; tItr < t; tItr++) {
                int n = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                int[] q = new int[n];

                String[] qItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int i = 0; i < n; i++) {
                    int qItem = Integer.parseInt(qItems[i]);
                    q[i] = qItem;
                }

                minimumBribes(q);
            }

            scanner.close();
        }
    }
