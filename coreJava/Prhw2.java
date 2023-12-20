package corejava;

import java.util.*;

class Do
{
	public void show()
	{
		Scanner sc=new Scanner(System.in);
		int temp=0;
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;					
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
public class Prhw2 
{
	public static void main(String[] args) 
	{
		Do obj=new Do();
		obj.show();
		
	}
		
}







/*  --------------  Descending  -------------
 
 int a[]= {6,2,9,4,1};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];// i 6 j 2
					a[i]=a[j];
					a[j]=temp;
				}
			}System.out.println(a[i]);
		}
		
 
 
 --------------- find largest number ---------------
 
 int a[]= {6,2,9,4,1};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];// i 6 j 2
					a[i]=a[j];
					a[j]=temp;
				}
			}temp=a[i];
		}
		System.out.println(temp);
	
	
-------------------minimum-----------------
	
	 int a[]= {6,2,9,4,1};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];// i 6 j 2
					a[i]=a[j];
					a[j]=temp;
				}
			}temp=a[i];
		}
		System.out.println(temp);
		
		
------------sum of array----------------

Scanner sc=new Scanner(System.in);
		int ans=0;
		int n=sc.nextInt();
		int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        	ans+=arr[i];
        }System.out.print(ans);
	
	
 */