package lambdaaa;
@FunctionalInterface
interface Human
{
	int show(int i);
}

public class Lambdaprr {

	public static void main(String[] args) {
		Human obj= i -> i+5; //  i+5 is the return type
		//if two parameter we pass Human obj=(i,j) -> i+j;
		System.out.println(obj.show(5));
    }

}


/*

----------lambda expression without parameter-------

{
		Human obj=() -> System.out.println("Hello");
		here -> represent lambda and print statement is the expression
		obj.show();
	}


*/