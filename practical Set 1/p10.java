import java.util.Scanner;

class p10 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter your number");
        byte n = A.nextByte();
        byte p = n;  
      System.out.println("byte value : "+p);  
      // Implicit Typecasting  
      short q = p;  
      System.out.println("short value : "+q);  
      int r = q;  
      System.out.println("int value : "+r);  
      long s = r;  
      System.out.println("long value : "+s);  
      float t = s;  
      System.out.println("float value : "+t);  
      double u = t;  
      System.out.println("double value : "+u);  
   }  
}  

