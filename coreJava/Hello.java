package corejava;
import java.util.*;

class Student
{
	int a;
	int b;
	int c;
	public Student(int age,int mark)
	{
		this.a=age;
		this.b=mark;
	}
	public Student()
	{
		System.out.println("hii");
	}
	public int add(int c)
	{
		System.out.print(c);
		return c;
	}
}


public class Hello {
	
	public static void main(String[] args) {
		Student obj=new Student(10,80);
		Student obj1=new Student();
		Student obj2=new Student();
		obj2.add(10);
		System.out.print(obj.a + obj.b);
		
		
	}

}
