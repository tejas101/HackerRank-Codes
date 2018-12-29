public class MyClass {
    public static void main(String args[]) {
        String st = "fdjsqlgmcux";
         StringBuilder s = new StringBuilder(st);
         int i=0;
         int j=s.length()-1;
         int cost=0;
		// using simple for loop
		for (; i < j; i++,j--) {
			//System.out.println("I  "+s.charAt(i));
			//System.out.println("J  "+s.charAt(j));
			
             if(s.charAt(i)<s.charAt(j)){
              //cost+=a[j]-a[i];
              //a[j]=a[i];
              cost+=(s.charAt(j))-(s.charAt(i));
              //s.charAt(j)='a';
              s.setCharAt(j, s.charAt(i));
              
              
           }
           else{
               if(s.charAt(i)>s.charAt(j)){
              //cost+=a[i]-a[j];
              //a[i]=a[j];
              cost+=(s.charAt(i))-(s.charAt(j));
              //s.charAt(i)='a';
              s.setCharAt(i, s.charAt(j));
              
           }
           }
		}
		
		System.out.println(cost);
		System.out.println(s);
    }
}
