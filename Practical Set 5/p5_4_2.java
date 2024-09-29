/******************************************************************************

5.4.2
Super keyword using Method
*******************************************************************************/
class v {
	void display() {
		System.out.println("this is super");
	}
}
class b extends v {
	void display() {
		super.display();
		System.out.println("this is sub class");
	}
}
public class p5_4_2
{
	public static void main(String[] args) {
		b b1=new b();
		b1.display();
	}
}