/******************************************************************************

Write a program in Java to demonstrate multilevel inheritance.

*******************************************************************************/
class a{
    int a,b;
    void setdata(int x,int y){
        a=x;
        b=y;
    }
}
class b  extends a{
    void add(){
       int c=a+b;
       System.out.println("Sum="+c);
    }
}
class p5_2 extends b{
    void sub(){
       	int d=a-b;
       	System.out.println("Sub="+d);
    }
	public static void main(String[] args) {
	    p5_2 p1=new p5_2();
	    p1.setdata(15,10);
	    p1.add();
	    p1.sub();
	}
}
