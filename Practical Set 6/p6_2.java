/******************************************************************************

Write a program in Java to demonstrate multiple inheritance using interface.

*******************************************************************************/
interface l1{
    static final int a=10;
    public void display();
}
interface l2{
    static final int b=20;
    public void print();
}
public class p6_2 implements l1,l2
{   
    public void display(){
        System.out.println("A="+b);
    }
    public void print(){
        System.out.println("B="+b);
    }
	public static void main(String[] args) {
		p6_2 a1=new p6_2();
		a1.display();
		a1.print();
	}
}