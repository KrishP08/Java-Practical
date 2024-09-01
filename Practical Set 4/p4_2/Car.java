/*
Write a program in java create Car class and set and get values of name and no using getdata()
and setdata() methods.
*/import java.util.Scanner;
public class Car
{
    String name;
    int no;
    public void setdata(String na,int n){
        name=na;
        no=n;
    }
    void getdata(){
	    System.out.println("name:-"+name);
	    System.out.println("no:-"+no);
    }
	public static void main(String[] args) {
	    Car a1=new Car();
	    Scanner s1=new Scanner(System.in);
	    System.out.println("Enter Car name");
	    a1.name=s1.nextLine();
	    System.out.println("Enter Car no");
	    a1.no=s1.nextInt();
	    a1.setdata(a1.name,a1.no);
	    a1.getdata();
	}
}