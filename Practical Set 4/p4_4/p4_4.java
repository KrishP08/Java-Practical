/*
Write a program in java to show the use of this keyword.
*/
public class p4_4
{
    String a;
    void display(String a){
        this.a=a;
        System.out.println("your name is "+this.a);
    }
	public static void main(String[] args) {
		p4_4 s1=new p4_4();
		s1.display("krish");
	}
}
