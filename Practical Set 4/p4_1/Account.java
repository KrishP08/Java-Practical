/******************************************************************************

Write a program in Java to create an Account class and create three class variables name,
account_no and balance and also assign and display its values.

*******************************************************************************/
import java.util.Scanner;
public class Account
{
    String name; 
    int acc_no;
    int bal;
	public static void main(String[] args) {
	    Account a1=new Account();
	    Scanner s1=new Scanner(System.in);
	    System.out.println("Enter your name");
	    a1.name=s1.nextLine();
	    System.out.println("Enter your account no");
	    a1.acc_no=s1.nextInt();
	    System.out.println("Enter your balance");
	    a1.bal=s1.nextInt();
	  
	  
	    System.out.println("Custorm info");
	    System.out.println("name:-"+a1.name);
	    System.out.println("account no:-"+a1.acc_no);
	    System.out.println("balance:-"+a1.bal);
		s1.close();
	}
}
