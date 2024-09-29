/******************************************************************************

Write a program in Java to demonstrate one interface extends another interface.

*******************************************************************************/
interface l1{
    static final int a=10;
    public void display();
}
interface l2 extends l1{
    static final int b=20;
    public void print();
}
public class p6_3 implements l2
{   
    public void display(){
        System.out.println("A="+a);
    }
    public void print(){
        System.out.println("B="+b);
    }
	public static void main(String[] args) {
		p6_3 a1=new p6_3();
		a1.display();
		a1.print();
	}
}