/******************************************************************************

Write a program in Java to demonstrate abstract class.

*******************************************************************************/
abstract class a{
    abstract void run();
}
class b extends a{
    void run(){
        System.out.println("this sub class");
    }
}
public class p5_6
{
	public static void main(String[] args) {
		a c1=new b();
		c1.run();
	}
}
