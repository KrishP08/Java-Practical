/******************************************************************************

p5_4_3
Super keyword using constructor    
*******************************************************************************/
class v{
    void v(){
        System.out.println("this is super");
    }
}
class b extends v{
    void b(){
            super();
            System.out.println("this is sub class");
    }
}
public class p5_4_3
{
	public static void main(String[] args) {
		  b b1=new b(); 
	}
}