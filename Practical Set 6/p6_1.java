/******************************************************************************

Write a program in Java to demonstrate interface.

*******************************************************************************/
interface l1{
    static final int a=10;
    static final int b=20;
    public void display();
}

public class p6_1 implements l1
{   
    public void display(){
        System.out.println("Sum="(a+b));
    }
    
	public static void main(String[] args) {
		p6_1 a1=new p6_1();
		a1.display();
	}
}