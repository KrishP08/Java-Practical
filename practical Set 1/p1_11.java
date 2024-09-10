import java.util.Scanner;

class p1_11 {
    public static void main(String[] args) {
        	Scanner A = new Scanner(System.in);
      	System.out.println("Enter your number");
        	float f = A.nextFloat();
	System.out.println("float value : " + f);
	long l=(long)f;
	System.out.println("Long value : " + l);
	int i=(int)l;
	System.out.println("Long value : " + i);
	A.close();
}
}