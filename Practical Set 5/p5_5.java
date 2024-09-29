/******************************************************************************

Write a program in java to demonstrate method overriding.

*******************************************************************************/
class v{
    void display(){
        System.out.println("this is super");
    }
}
class b extends v{
    void display(){
            System.out.println("this is sub class");
    }
}
public class p5_5
{
	public static void main(String[] args) {
		  b b1=new b(); 
		  b1.display();
	}
}