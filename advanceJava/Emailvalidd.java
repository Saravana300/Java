package Advancejava;
import java.util.*;
public class Emailvalidd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String email=sc.nextLine();
		int count=1;
		if(email.endsWith("@gmail.com") && !email.isEmpty())
		{
			for(int i=0;i<email.length()-10;i++)
			{
				if((email.charAt(i)>=0 && email.charAt(i)<=9) || (email.charAt(i)>='a' && email.charAt(i)<='z'))
				{
					count++;
				}
				else {
					count=0;
					break;
				}
			}
			if(count==0){
				System.out.print("Email correct aa podura");
			}
			else {
				System.out.print("Email is correct");
			}
		}
		else {
			System.out.print("Email is Empty or incorrect");
		}
		
	}

}
