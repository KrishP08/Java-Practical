/******************************************************************************

Write a program in java for Parameterized constructor or constructor overloading.

*******************************************************************************/
class Student{
    Student(){
        System.out.println("constructor created");
    }
    Student(String a){
        System.out.println("name is "+a);                          
    }
}
public class p4_8
{
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student("krish");
	}
}
