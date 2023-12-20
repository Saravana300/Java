package practicecore;

class Student
{
	Student()
	{
		super();
		System.out.println("in student");
	}
	Student(int n1,int n2)
	{
		super();
		System.out.println("in student pr");
	}
}
class Student1 extends Student
{
	Student1()
	{
		super();
		System.out.println("in student1");
	}
	Student1(int n1,int n2)
	{
		super(4,5);
		System.out.println("in student1 pr");
	}
}



public class Advcalc {

	public static void main(String[] args) {
		Student1 obj=new Student1();
		
		

	}

}
