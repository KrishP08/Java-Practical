/******************************************************************************
Write a program in Java to demonstrate all uses of super keyword.
*******************************************************************************/
class v{
    int s=50;
}
class b extends v{
    int s=100;
    void display(){
    System.out.println("speed is "+super.s);
    }
}
public class p5_4_1
{
	public static void main(String[] args) {
		  b b1=new b(); 
		  b1.display();
	}
}
