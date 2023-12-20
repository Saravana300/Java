package corejava;
import java.util.*;
public class Oddeven {

	public static void main(String[] args) {
		int odd=0;
		Scanner s=new Scanner(System.in);
		System.out.println("How many Integer do you need to print odd/Even");
		int num=s.nextInt();
		for(int i=0;i<=num;i+=2)
		{
			System.out.println("Even "+i);
			if(i==num && i%2!=1)
			{
				break;
			}
			odd=i+1;
			System.out.println("Odd "+odd);
		}
	}
	
}