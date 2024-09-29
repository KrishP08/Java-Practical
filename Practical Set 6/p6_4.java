/******************************************************************************

Write a program that illustrates interface inheritance. Interface P12 inherits from both P1 and
P2. Each interface declares one constant and one method. The class Q implements P12.
Instantiate Q and invoke each of its methods. Each method displays one of the constants.

*******************************************************************************/
interface p1{
    static final int a=10;
    public void display();
}
interface p2 {
    static final int b=20;
    public void print();
}
interface p12 extends p1,p2 {
    static final int c=30;
    public void show();
}
class Q implements p12{
     public void display(){
        System.out.println("A="+a);
    }
    public void print(){
        System.out.println("B="+b);
    }
     public void show(){
        System.out.println("C="+c);
    }
}
public class p6_4 extends Q
{
	public static void main(String[] args) {
		p6_4 a1=new p6_4();
		a1.display();
		a1.print();
		a1.show();
	}
}
