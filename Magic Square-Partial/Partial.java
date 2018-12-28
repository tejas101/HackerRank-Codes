import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        //int []evP= new int[4];
        //int []od= new int [4];
        List evP = new ArrayList();
        List odP = new ArrayList();
        int cost=0;
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        ArrayList<Integer> evenRe = new ArrayList<Integer>();
        ArrayList<Integer> oddRe = new ArrayList<Integer>();

        even.add(2); even.add(4); even.add(6); even.add(8);
        odd.add(1); odd.add(3); odd.add(7); odd.add(9);
        for(int i=0;i<3;i++)
         for(int j=0;j<3;j++)
          {    
              if((i==j && i!=1) || Math.abs(i-j)==2)
              {  
                  if(s[i][j]% 2 == 0)
                  {  
                     if(evP.contains(s[i][j])) 
                      evenRe.add(s[i][j]);
                     else
                    evP.add(s[i][j]);
                  }
              }

              if(Math.abs(i-j)==1)
              {
                  if(s[i][j]% 2 != 0)
                  {  
                    if(odP.contains(s[i][j])) 
                      oddRe.add(s[i][j]);
                     else
                     odP.add(s[i][j]);
                        
                  }
              }
          }

        //   System.out.println(evP);
        //   System.out.println(odP);
        //    System.out.println(evenRe);
        //   System.out.println(oddRe);
           even.removeAll(evP);
           odd.removeAll(odP);
           System.out.println(even);
        //   System.out.println(odd);

        if(s[1][1]!=5)
        {  
            cost+=Math.abs(s[1][1]-5);
            s[1][1]=5;
        }

        for(int i=0;i<3;i++)
         for(int j=0;j<3;j++)
          {
                if((i==j && i!=1) || Math.abs(i-j)==2) {
                    if (s[i][j] % 2 != 0 || evenRe.contains(s[i][j])) {
                        //System.out.println("In for "+s[i][j]+i+j);
                       int min=999;
                       int prev=s[i][j];
                       for(int k=0;k<even.size();k++)
                       {   int a =even.get(k);
                           int temp=Math.abs(s[i][j] - a);
                          if(temp < min)
                          {
                              min=temp;
                              s[i][j]=even.get(k);
                          }
                       }
                       cost+=Math.abs(s[i][j]-prev);
                       if(evenRe.contains(prev))
                       evenRe.remove(new Integer(prev));
                       //System.out.or
                    }
                }


                if (Math.abs(i - j) == 1) {
                    if (s[i][j] % 2 == 0 || oddRe.contains(s[i][j])) {
                        int min = 999;
                        int prev=s[i][j];
                        for (int k = 0; k < odd.size(); k++) {
                            int a=odd.get(k);
                            int temp=Math.abs(prev - a );
                            //System.out.print("Checking "+s[i][j]+"-"+a);
                            if (temp < min) {

                                min = temp;
                                s[i][j] = odd.get(k);
                                //System.out.println("Selected "+odd.get(k)+" for"+prev);
                            }
                        }
                        cost+=Math.abs(s[i][j]-prev);
                        if(oddRe.contains(prev))
                       oddRe.remove(new Integer(prev));
                    }
                }

          }

    for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
         System.out.print(s[i][j]+ " ");}
         System.out.println("");
       }

    return cost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
