package Advancejava;

class Student   // class with name Student
{
	String name;  //instance variable
	int rollno;  //instance variable
	String dept;  //instance variable
	static String clgname="KRCT";  //static variable
	
	public static void show(Student obj)  //method with name show()
	{
		//here we cannot access the non static variable(instance variable) in the static variable
		//so,in below we pass obj1 value through parameters and create new reference variable-
		//-and put it in the method like -Student obj - and in print statement call the newly -
		//-created object and use like - obj.name;
		System.out.println(obj.name + ":" + obj.rollno + ":" + obj.dept + ":" + clgname );
	}
}
public class Classpr_objjpr {

	public static void main(String[] args) {
		Student obj1=new Student();   //create a new object with the reference variable name obj1
		obj1.name="saro";
		obj1.rollno=8117;
		obj1.dept="CSE";
		
//		Student obj2=new Student();
//		obj2.name="saro";
//		obj2.rollno=8117;
//		obj2.dept="CSE";
//		
//		Student obj3=new Student();
//		obj3.name="saro";
//		obj3.rollno=8117;
//		obj3.dept="CSE";
		
		
		Student.show(obj1);//static call through the class name and pass the value through parameter(obj1)
//		obj2.show();//without static method we use this syntax to call
//		obj3.show();
	}

}



/*
--------------------------method overloading ------------------------------

public static int show(int a,int b)
     {
     return a+b;  
     }
     
public static double show(double a,int b)        //same method name with different parameters
     {
     return a+b;  
     }
     
public static int show(int a,int b,int c)
     {
     return a+b+c;  
     }


*/