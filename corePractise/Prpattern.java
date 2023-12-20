package practicecore;

import java.util.Scanner;

public class Prpattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("How many Lesser do you want to print the pyramid ");
		int pyramid=sc.nextInt();
		for(int i=1;i<=pyramid;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
		System.out.println(" ");
		}
	}
}