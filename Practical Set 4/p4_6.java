/******************************************************************************

Write a program in java to show the use of final keyword.

*******************************************************************************/
public class p4_6
{
    final int a=10;
    void display(){
        //a=a+1;
        System.out.println("Final variable value is "+a);
    }
	public static void main(String[] args) {
	    p4_6 a1=new p4_6();
	    a1.display();
	}
}
