public class HelloWorld{

     public static void main(String []args){
        int []a={1,2,3,4,5,6};
        System.out.println(a.length);
        int i=0;
        int j=a.length-1;
        int cost=0;
        for(;i<j;i++,j--){
            //System.out.println("For i "+a[i]);
           // System.out.println("For j "+a[j]);
           
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
        System.out.println("Cost is "+cost);
        for(int k=0;k<a.length;k++)
         System.out.print(a[k]);
     }
}