package practicecore;
import java.util.Scanner;
public class Average_and_find_odd_even {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int value=0;
		int[] arr=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=s.nextInt();
			value+=arr[i];
		}
		value/=a;
		if(value % 2 == 0) {
			System.out.print("Value is "+ value +"and it is even");
		}
		else {
			System.out.print("Value is "+ value +"and it is odd");
		}
	}
}
