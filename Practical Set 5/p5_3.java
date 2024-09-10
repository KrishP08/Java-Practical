/******************************************************************************

Write a program in Java to demonstrate hierarchical inheritance.

*******************************************************************************/
class a{
    int p,k;
    void setdata(int x,int y){
        p=x;
        k=y;
    }
}
class b  extends a{
    void add(){
        int c=k+p;
       System.out.println("Sum="+c);
    }
}
class p5_3 extends a{
    void sub(){
       	int d=p-k;
       	System.out.println("Sub="+d);
    }
	public static void main(String[] args) {
	    p5_3 p1=new p5_3();
	    b b1=new b();
	    p1.setdata(15,10);
	    b1.setdata(15,10);
	    b1.add();
	    p1.sub();
	}
}