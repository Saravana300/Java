package exceptionpr;

class Human 
{
	public void show() throws Excepprr
	{
		int i=0;
		int j=0;
		j=5/i;	
	}
}
class Animal 
{
	public void show1() throws Excepprr
	{
		int[] arr= {10,20,30};
		int a=arr[6];
	}

}

public class Excepprr extends Exception{

	public static void main(String[] args) {
		Human obj=new Human();
		
		try {
			obj.show();
		} 
		catch (Exception e) {
			System.out.println("error");
		}
		Animal obj1=new Animal();
		try {
			obj1.show1();
		} catch (Exception e) {
			System.out.println("p e w t limit");
		}System.out.println("hello");
	}
	

}
