/*
Write a program in java to create Box class and find volume of box.
*/
import java.util.Scanner;
class Box
{
    float w;
    float h;
    float b;
    float volume(float w1,float h1,float b1){
        return w1*h1*b1;
     }
}
    class exbox{
	    public static void main(String[] args) {
	        Box b1=new Box();
	        Scanner s1=new Scanner(System.in);
	        System.out.println("Enter Box w");
	        b1.w=s1.nextInt();
	        System.out.println("Enter Box h");
	        b1.h=s1.nextInt();
	        System.out.println("Enter Box b");
	        b1.b=s1.nextInt();
	        float vol=b1.volume(b1.w,b1.h,b1.b);
	        System.out.println("volume of Box is "+vol);
			s1.close();
	}
}
