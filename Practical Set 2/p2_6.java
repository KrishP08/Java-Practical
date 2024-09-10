public class p2_6
{
    public void finalize(){
        System.out.println("object is garbage collected");
    }
	public static void main(String[] args) {
		p2_6 s1=new p2_6();
		p2_6 s2=new p2_6();
		s1=null;
		s2=null;
		System.gc();
	}
}