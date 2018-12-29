import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;
public class HelloWorld{
 
     public static void main(String []args){
         int []a={1,1,3,4,5,6,6,6,6,6,4,4,3};
        
        // ArrayList<Integer> number = new ArrayList<Integer>();
        // ArrayList<Integer> freq = new ArrayList<Integer>();
        
        // for(int i=0;i<a.length;i++){
        //     if(!(number.contains(a[i]))){
        //         number.add(a[i]);
        //         freq.add(1);
        //     }
        //     else{
        //         int index=number.indexOf(a[i]);
        //         int temp=freq.get(index);
        //         freq.set(index,++temp);
        //     }
            
        // }
        // System.out.println(number);
        // System.out.println(freq);
        
        
    //     Hashtable<Integer, Integer> h = new Hashtable<Integer,Integer>(); 
  
  
    //     h.put(3, 2); 
    //     h.put(2, 3); 
    //     h.put(1, 2); 
        
    //   int temp=h.get(2);
    //   h.put(2,++temp);
    //   System.out.println(h.get(2));
    
    
   Map<Integer, Integer> s = new HashMap<>();
  //First put all the data in the HashMap
 
 for(int i=0;i<a.length;i++){
     
     if(!(s.containsKey(a[i]))){
                s.put(a[i],1);
                
            }
            else{
                int temp=s.get(a[i]);
       s.put(a[i],++temp);
       
            }
 }
 
  System.out.println("map before sorting: " + s);
  
  // let's sort this map by values first
    Map<Integer, Integer> sorted = s
        .entrySet()
        .stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .collect(
            toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                LinkedHashMap::new));

    System.out.println("map after sorting by values: " + sorted);
    //Now covert the map to array (Seprate keys and values arrays)
    int[] keys = new int[sorted.size()];
int[] values = new int[sorted.size()];
int index = 0;
for (Map.Entry<Integer, Integer> mapEntry : sorted.entrySet()) {
    keys[index] = mapEntry.getKey();
    values[index] = mapEntry.getValue();
    index++;
}

// for(int i=0;i<values.length;i++){
//     System.out.print(values[i]);
//     //System.out.print(values[i]);
// }
// System.out.println();
// for(int i=0;i<values.length;i++){
//     //System.out.print(values[i]);
//     System.out.print(keys[i]);
// }
//Make a final Array to hold the sorted elements by frequency by using the key and values array.
int someCt=-1;
int []finArry = new int[a.length];
for(int i=0;i<values.length;i++){
    for(int j=0;j<values[i];j++){
        finArry[++someCt]=keys[i];
    }
}
//Print/return the final Array
for(int idd=0;idd<finArry.length;idd++){
    System.out.print(finArry[idd]);
}
 
     }
}