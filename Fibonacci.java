public class Fibonacci { 
    public static void main(String[] args) {
         int a = 1; 
         int b = 1; 
         for(int i = 1;i <= 6;i++) { 
             System.out.print(a + "\t" + b + "\t");
              a = a + b;
              b = a + b; 
              } 
      } 
}