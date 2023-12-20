package Advancejava;
import java.util.*;
public class Secondlarg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp=0,count=0,b=0;
		int num=sc.nextInt();
		int[] arr=new int[num];
		int[] brr=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++) {
			for(int j=i+1;j<num;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];// i 6 j 2
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<num;i++)
		{
			count=0;
			for(int j=i+1;j<num;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				brr[b]=arr[i];
				b++;
			}
		}
		if(b==1) 
		{
			System.out.print("All the numbers are equal");
		}
		else
		{
			for(int i=b-1;i>b-2;i--)
			{
				System.out.print("The Second Largest number is " +brr[i-1]);
			}
		}

	}

}
