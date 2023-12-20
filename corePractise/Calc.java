package practicecore;

class Human
{
	int n;
	public void base(int n,Human obj)
	{
		Human obj1=obj;
		obj1.n=n;
		System.out.print(n);
	}
}
public class Calc {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.base(5,obj);
	}

}
