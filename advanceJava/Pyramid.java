package Advancejava;
import java.util.*;
public class Pyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("How many Lesser do you want to print the pyramid ");
		int pyramid=sc.nextInt();
		for(int i=0;i<pyramid;i++)
		{
			for(int j=pyramid-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(" *");
			}
		System.out.println(" ");
	}
	}
}
