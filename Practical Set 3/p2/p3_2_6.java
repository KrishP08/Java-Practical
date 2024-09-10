public class p3_2_6
{
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("hello");
		//String s2=new String("hello");
		System.out.println(s1);
		System.out.println("After delete: " + s1.delete(4, 7));
		System.out.println("After deleteCharAt: " + s1.deleteCharAt(0));
	}
}
