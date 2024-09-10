/******************************************************************************

Write a program in Java to demonstrate single inheritance.

*******************************************************************************/
class a{
    int a,b;
    void setdata(int x,int y){
        a=x;
        b=y;
    }
}
public class p5_1 extends a{
    void add(){
        int c=a+b;
       	System.out.println("Sum="+c);
    }

	public static void main(String[] args) {
	    p5_1 p1=new p5_1();
	    p1.setdata(10,15);
	    p1.add();
	}
}