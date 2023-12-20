package Advancejava;
import java.util.*;
public class Countnumb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] brr=new int[100];
		int b=0;
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        	int count=0;
        	for(int j=i+1;j<n;j++)
        	{
        		if(arr[i] == arr[j]) {
        			count++;
        		}
        	}
        	if(count==0)
        	{
        		brr [b]=arr[i];
    			b++; 
        	}        	
        }
        for(int i=0;i<b;i++)
        {
        	int check=0;
        	for(int j=0;j<n;j++)
        	{
        		if(brr[i]==arr[j]) 
        		{
        			check++;
        		}
        	}
        	System.out.println(brr[i] + " "+check);
        }
	}

}
