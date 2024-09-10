/******************************************************************************

Write a program in java of static data and static method.

*******************************************************************************/
class test{
    static int a=10;
    static int b=15;
    static void display(){
        System.out.println("A="+a);
    }
}
public class p4_5
{
	public static void main(String[] args) {
	   test.display();   
	   System.out.println("B="+test.b);
	}
}
