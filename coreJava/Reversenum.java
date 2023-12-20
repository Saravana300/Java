package corejava;

import java.util.Scanner;

public class Reversenum {
	public static void main(String[] args) {
		int val=0;
		int last=0;
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		while(num!=0) {
			last=num%10;//last num
			val=(val*10)+last;
			num/=10;
		}
		System.out.print(val);
	}

}
//123  -  321