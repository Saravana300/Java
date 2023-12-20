package practicecore;

import java.util.Scanner;

public class Reversenum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int last,sum=0;
		int num=s.nextInt();
		String n=String.valueOf(num);
		for(int i=0;i<n.length();i++) {
			last=num%10;
			sum=(sum*10)+last;
			num/=10;
		}
		System.out.print(sum);
	}
}
