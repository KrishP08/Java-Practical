public class p6
{
    public void finalize(){
        System.out.println("object is garbage collected");
    }
	public static void main(String[] args) {
		p6 s1=new p6();
		p6 s2=new p6();
		s1=null;
		s2=null;
		System.gc();
	}
}